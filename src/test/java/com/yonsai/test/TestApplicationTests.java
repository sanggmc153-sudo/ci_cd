package com.yonsai.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.yonsai.test.controller.TestController;
import com.yonsai.test.service.TestService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class TestApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test 
    void 인사url테스트() throws Exception {

	// 1. given : 준비
	MockMvc url테스트도구 = MockMvcBuilders // 테스트 도구 만들기 
	                      .standaloneSetup(new TestController())
						  .build();
    // 2. When : 실행
	url테스트도구.perform(get("/hello"))    // 요청실행
               .andExpect(status().isOk());            // 응답 코드(Then.검증) 
               
	  
}   
    





private void andExpect(ResultMatcher string) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'andExpect'");
	}

	//----------------------------------
	@Test 
	void 더하기테스트() {
    // 1. given : 준비
    TestService 서비스 = new TestService();

    // 2. when :실행
    int 결과 = 서비스.add(3, 2);

    // 3. then : 검증
    assertEquals(5, 결과);

	}

//-----------------------------------
    @Test 
    void 인사(){
	// 1. 컨트롤러 객체 생성
	TestController 컨트롤러 = new TestController();

	// 2. 테스트할 메서드 실행하기
    String 결과 = 컨트롤러.hello();

	// 3. 예상한 결과랑 실제 결과 비교하기
	assertEquals("Hello", 결과);
  }
}
/*
테스트 코드를 일기 쉽게 만드는 구조!
Given (준비) - 필요한 객체나 데이터 만들기
When (실행) - 검사할 메서드 호출하기 
Then (검증) - 결과가 예상과 같은지 확인 

함수명들을 대부분 한글로 작성로 작성해도 된다
 어떤 테스트인지 어떤걸 확인지 쉽게 읽으려고 한글로 작성을 많이 한다.

 url들이 정상적으로 요청되는 테스트진행! 
 MockMvc - 실제 서버를 실행하지 않아도 HTTP 요청을 흉내내서 컨트롤러를 
 테스트 하는 도구!

 
 프론트엔드 검사
 Jest / vitest 함수와 화면 로직검사 
 
 벡엔드 검사 : 잘못된 요청을
 Junit5 , AssertJ , Mockito , MockMvc 종류들 찾아보기 

 React 컴포넌트 테스트
  - React Testing Library

 브라우저 자동테스트
  - Playwright / Cypress
  
 부하 테스트
  - 많은 요청이 몰릴때 성능확인 
  - JMeter / K6 

 



*/