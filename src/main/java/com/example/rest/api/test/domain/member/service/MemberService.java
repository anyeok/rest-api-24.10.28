package com.example.rest.api.test.domain.member.service;

import com.example.rest.api.test.domain.member.entity.Member;
import com.example.rest.api.test.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public Member join(String username, String password) {
        Member checkedMember = this.memberRepository.findByUsername(username);

        if (checkedMember != null) {
            throw new RuntimeException("이미 가입됩 사용자 입니다.");
        }

        Member member = Member.builder()
                .username(username)
                .password(passwordEncoder.encode(password))
                .build();

        this.memberRepository.save(member);

        return member;
    }

    public Member getMember(String username) {
        return memberRepository.findByUsername(username);
    }
}