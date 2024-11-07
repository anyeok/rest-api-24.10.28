package com.example.rest.api.test.domain.member.controller;

import com.example.rest.api.test.domain.member.dto.request.MemberRequest;
import com.example.rest.api.test.domain.member.dto.response.MemberResponse;
import com.example.rest.api.test.domain.member.entity.Member;
import com.example.rest.api.test.domain.member.service.MemberService;
import com.example.rest.api.test.global.RsData.RsData;
import com.example.rest.api.test.global.jwt.JwtProvider;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/members")
@RequiredArgsConstructor
@Tag(name = "ApiV1MemberController", description = "회원 인증인가 API")
public class ApiV1MemberController {
    private final MemberService memberService;
    private final JwtProvider jwtProvider;

    @PostMapping("/join")
    public RsData<MemberResponse> join(@Valid @RequestBody MemberRequest memberRequest) {
        Member member = this.memberService.join(memberRequest.getUsername(), memberRequest.getPassword());
        return RsData.of("200", "회원가입이 완료되었습니다.", new MemberResponse(member));
    }

    @PostMapping("/login")
    public String login() {
        Member member = memberService.getMember("admin");
        return jwtProvider.generateAccessToken(member, 10);
    }
}