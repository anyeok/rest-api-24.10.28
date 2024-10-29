package com.example.rest.api.test.article.service;

import com.example.rest.api.test.article.dto.ArticleDTO;
import com.example.rest.api.test.article.entity.Article;
import com.example.rest.api.test.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;
    public List<ArticleDTO> getList() {
        List<Article> articleList = this.articleRepository.findAll();

        List<ArticleDTO> articleDTOList = articleList.stream()
                .map(article -> new ArticleDTO(article))
                .collect(Collectors.toList());

        return articleDTOList;
    }

    public ArticleDTO getArticle(Long id) {
        Optional<Article> optionalArticle = this.articleRepository.findById(id);

        return optionalArticle.map(article -> new ArticleDTO(article)).orElse(null);
    }
}