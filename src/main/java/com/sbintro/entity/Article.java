package com.sbintro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // 어노테이션을 통해 DB가 해당 객체를 인식가능하게 한다.
public class Article {

    @Id // 대표값을 지정 like 주민등록번호
    @GeneratedValue // 1,2,3,... 숫자 자동 생성시키는 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    // 엔티티를 만들기 위한 생성자 추가

    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
