package com.example.rest.api.test.article.controller;

import com.example.rest.api.test.article.service.ArticleService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/articles")
@RequiredArgsConstructor
public class ApiV1ArticleController {
    private final ArticleService articleService;

    @GetMapping("")
    public String list() {
        return"";
    }

    @GetMapping("/{id}")
    public String getArticles() {
        return "";
    }

    @PostMapping("")
    public String create() {
        return"";
    }

    @PatchMapping("/{id}")
    public String modify() {
        return "";
    }

    @DeleteMapping("/{id}")
    public String delete() {
        return "";
    }
}
