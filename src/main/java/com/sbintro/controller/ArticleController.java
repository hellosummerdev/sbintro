package com.sbintro.controller;

import com.sbintro.dto.ArticleForm;
import com.sbintro.entity.Article;
import com.sbintro.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @Autowired // 스프링 부트가 미리 생성해놓은 객체를 가져다가 자동 연결. 어디에 만들어진 객체를 자동으로 연결시켜주더라!
    private ArticleRepository articleRepository; // 객체를 만들지 않아도 된다.

    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        System.out.println(form.toString());
        
        // 1. DTO를 Entity로 변환
        Article article = form.toEntity();
        System.out.println(article.toString());

        // 2. Repository에게 Entity를 DB 안에 저장하게 함
        Article saved = articleRepository.save(article); // CrudRepository에서 제공하는 기능들을 상속받았기 때문에 그대로 사용할 수 있음
        System.out.println(saved.toString());
        return "";
    }
}
