package com.yonsai.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
/*
스프링부트 테스트란?
 - 내가 작성한 코드가 의도한 대로 동작하는지 코드로 검증하는것!
 - 가장 많이 현업 Junit5 라이브러리를 이용해서 테스트 진행!
 - 기본적으로 스프링부트 web 도구를 다운로드하면 자동으로 포함되어있다!
 * 스프링부트 테스트 종류
 * - 단위 테스트 (Unit Test)
 * 작은 기능 하나를 따로 검사
 * 계층별(Controller / service / Repository)
 * 
 * - 통합 테스트 (Integration Test)
 * 한번에 여러개를 테스트하는 방법
 * 여러 구성 요소를 연결해서 검사
 * 화면 -> 컨트롤러 -> 서비스 -> DB
 * 
 * 스프링부트 테스트 장점
 * - 빠른 피드백
 * - 안전한 리팩토링
 * - CI/CD 푸시를 할 때마다 자동으로 검증!
 * 
 */
