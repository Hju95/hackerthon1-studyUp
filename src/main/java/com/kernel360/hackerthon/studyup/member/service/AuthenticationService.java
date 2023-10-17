package com.kernel360.hackerthon.studyup.member.service;

import com.kernel360.hackerthon.studyup.member.entity.Member;
import com.kernel360.hackerthon.studyup.member.exception.GoogleSignInException;
import com.kernel360.hackerthon.studyup.member.exception.SignupException;

import javax.security.auth.login.LoginException;

public interface AuthenticationService {
    // 기본 회원가입
    void signup(Member member) throws SignupException;

    // 소셜 회원가입 - 선택
    void signupWithGoogle(String googleToken) throws SignupException;

    // 기본 로그인
    void login(Member member) throws LoginException;

    // 소셜 로그인 - 선택
    Member loginWithGoogle(String googleToken) throws GoogleSignInException;


}
