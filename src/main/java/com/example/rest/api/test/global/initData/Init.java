package com.example.rest.api.test.global.initData;

import com.example.rest.api.test.domain.article.service.ArticleService;
import com.example.rest.api.test.domain.member.entity.Member;
import com.example.rest.api.test.domain.member.service.MemberService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Init {
    @Bean
    CommandLineRunner initData(ArticleService articleService, MemberService memberService) {

        return args -> {
        };
    }
}