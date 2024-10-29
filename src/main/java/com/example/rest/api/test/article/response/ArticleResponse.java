package com.example.rest.api.test.article.response;

import com.example.rest.api.test.article.dto.ArticleDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ArticleResponse {
    private  final ArticleDTO article;
}