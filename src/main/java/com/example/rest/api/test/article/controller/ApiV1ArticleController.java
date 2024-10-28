package com.example.rest.api.test.article.controller;

import com.example.rest.api.test.article.dto.ArticleDTO;
import com.example.rest.api.test.article.entity.Article;
import com.example.rest.api.test.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/articles")
@RequiredArgsConstructor
public class ApiV1ArticleController {
    private final ArticleService articleService;

    @GetMapping("")
    public List<ArticleDTO> list() {
        List<ArticleDTO> articleList = new ArrayList<>();

        articleList.add(new ArticleDTO(new Article("제목 1", "내용 1")));
        articleList.add(new ArticleDTO(new Article("제목 2", "내용 2")));
        articleList.add(new ArticleDTO(new Article("제목 3", "내용 3")));

        return articleList;
    }

    @GetMapping("/{id}")
    public ArticleDTO getArticles(@PathVariable("id") Long id) {
        Article article = new Article("제목", "내용");
        ArticleDTO articleDTO = new ArticleDTO(article);
        return articleDTO;
    }

    @PostMapping("")
    public String create(@RequestParam("subject") String subject, @RequestParam("content") String content) {
        System.out.println(subject);
        System.out.println(content);
        return "등록 완료";
    }

    @PatchMapping("/{id}")
    public String modify(@PathVariable("id") Long id, @RequestParam("subject") String subject, @RequestParam("content") String content) {
        System.out.println(id);
        System.out.println(subject);
        System.out.println(content);
        return "수정 완료";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        System.out.println(id);
        return "삭제 완료";
    }
}
