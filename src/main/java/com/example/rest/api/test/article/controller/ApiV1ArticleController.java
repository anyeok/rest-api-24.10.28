package com.example.rest.api.test.article.controller;

import com.example.rest.api.test.article.dto.ArticleDTO;
import com.example.rest.api.test.article.request.ArticleCreateRequest;
import com.example.rest.api.test.article.request.ArticleModifyRequest;
import com.example.rest.api.test.article.response.ArticleResponse;
import com.example.rest.api.test.article.response.ArticlesResponse;
import com.example.rest.api.test.article.service.ArticleService;
import com.example.rest.api.test.global.RsData.RsData;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/articles")
@RequiredArgsConstructor
public class ApiV1ArticleController {
    private final ArticleService articleService;

    @GetMapping("")
    public RsData<ArticlesResponse> list() {
        List<ArticleDTO> articleList = this.articleService.getList();

        return RsData.of("200", "게시글 다건 조회 성공", new ArticlesResponse(articleList));
    }


    @GetMapping("/{id}")
    public RsData<ArticleResponse> getArticle(@PathVariable("id") Long id) {
        ArticleDTO articleDTO = this.articleService.getArticle(id);

        return RsData.of("200", "게시글 단건 조회 성공", new ArticleResponse(articleDTO));
    }

    @PostMapping("")
    public String create(@Valid @RequestBody ArticleCreateRequest articleCreateRequest) {

        return "등록완료";
    }

    @PatchMapping("/{id}")
    public String modify(@PathVariable("id") Long id, @Valid @RequestBody ArticleModifyRequest articleModifyRequest) {

        return "수정완료";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {

        return "삭제완료";
    }
}