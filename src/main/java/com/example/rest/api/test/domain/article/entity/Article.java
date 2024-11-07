package com.example.rest.api.test.domain.article.entity;

import com.example.rest.api.test.domain.member.entity.Member;
import com.example.rest.api.test.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class Article extends BaseEntity {
    String subject;
    String content;
    @ManyToOne
    private Member member;
}
