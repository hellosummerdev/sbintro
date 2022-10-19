package com.sbintro.repository;

import com.sbintro.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> { // <관리대상엔티티, 엔티티대표값의 타입>
    // JPA에서 제공하는 리파지토리 인터페이스를 활용해서 쉽게 만들어보자


}
