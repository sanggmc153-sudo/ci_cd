package com.yonsai.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.yonsai.test.controller.TestController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest // 스프링이 LoginTest자바파일은 테스트 파일이구나!
public class LoginTest {

  @Autowired
  TestController 컨트롤러;

  @Test
  void 일반로그인테스트() throws Exception {
    // 1. 준비
    MockMvc url테스트도구 = MockMvcBuilders // 테스트 도구 만들기
        .standaloneSetup(컨트롤러)
        .build();

    // 2. When: 실행
    url테스트도구.perform(
        post("/login")
            .param("id", "dmin")
            .param("pw", "admin11!")) // 요청 실행
        .andExpect(status().isOk()) // 응답 코드 (3.Then: 검증)
        .andExpect(content().string("로그인 성공"));

  }
  // 현업에서는 로그인성공테스트() , 로그인실패테스트()
  // status().isOk() 요청하고 응답이 잘 왔니?
  //   로그인을 성공했니? 아니다! HTTP입장에서는!
}