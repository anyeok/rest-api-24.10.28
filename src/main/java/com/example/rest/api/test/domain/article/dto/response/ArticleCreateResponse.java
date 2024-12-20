package com.example.rest.api.test.domain.article.dto.response;

import com.example.rest.api.test.domain.article.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ArticleCreateResponse {
    private final Article article;
}