package com.yonsai.test.controller;

import org.springframework.web.bind.annotation.RestController;

import com.yonsai.test.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/*
RestController vs Controller 어노테이션 차이?
 - RestController 외부 프론트들하고 값(데이터 문자,JSON)을 주고 받을 때 
 - Controller 내부 프론트들하고 값(화면)
*/

@RestController
public class TestController {

  // 일처리하는 서비스로 넘기기
  @Autowired
  private TestService 서비스;

  @GetMapping("/hello")
  public String hello() {
    return "Hello!";
  }

  // 통합 테스트 진행
  // 로그인하는 상황!
  // 화면 -> 컨트롤러 -> 서비스 -> 응답

  @PostMapping(value = "/login", produces = "text/plain;charset=UTF-8")
  public String login(@RequestParam("id") String id,
      @RequestParam("pw") String pw) {

    // 1. 서비스 실행
    boolean 결과 = 서비스.login(id, pw);

    // 2. 결과 선택 true -> 로그인 성공, false ->로그인 실패
    if (결과) {
      return "로그인 성공";
    }

    return "로그인 실패";
  }

}
