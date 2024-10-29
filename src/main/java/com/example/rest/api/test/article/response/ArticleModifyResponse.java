package com.example.rest.api.test.article.response;

import com.example.rest.api.test.article.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ArticleModifyResponse {
    private final Article article;
}