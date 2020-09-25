package com.backoffice_pos.backend.domain.posts;

import com.backoffice_pos.backend.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter  // 클래스 내 모든 필드의, Gatter를 자동 생성, 롬북의 어노테이션
@NoArgsConstructor // 기본생성자 자동 추가, 롬북의 어노테이션
@Entity // 테이블과 링크될 클래스를 나타냄, JPA의 어노테이션
public class Posts extends BaseTimeEntity {

    @Id  // PK 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK의 생성 규칙
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder  // 빌터 패턴 클래스를 생성
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }

}