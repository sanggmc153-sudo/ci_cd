package com.yonsai.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
  @GetMapping("/")
  public String main() {
    return "index";
  }

}
/* 
스프링 부트로 만든 파일을 프로그램을 만들어야 한다. 
배포하기 위해 묶는 파일 - jar, war. 

1. 자바 프로젝트를 압축해야 한다. 
gradlew.bat bootJar
2. 압축한 파일 확인하기
build -> libs 안에 내가 압축한 자바프로그램이 있다. 
3. EC2로 옮겨야된다. git 
4. 자바 실행해야된다. 
 - EC2에 자바JDK가 설치되어 있어야 한다. 
 - java -version
5. 자바 jar 실행하기
 메모리 사용량 제한을 둘 수 있다. 
 EC2메모리를 스프링부트가 전부 사용해버린다. 
 그럼 다른 프로그램들은 실행되지 않는다. 
   java -Xms128m -Xmx256m -jar test-0.0.1-SNAPSHOT.jar

* 현재 상태로 배포(운영)되고 있는 상태다. 
새로운 내용을 추가하거나 수정할 때 위에 내용을 반복해야,,

그래서 CI/CD 필요 - 
- 우리가 push 하면 테스트, 빌드, 배포 등 자동으로 해주는 도구! 
- Github Aactions

CI(continuous Integeration)
- 코드를 합칠때마다 자동으로 빌드하고 테스트
- 깃허브에서 코드를 테스트하고 jar파일까지 만든다. 

CD(Continuous delivery , Deployment)
   - 배포 준비까지 자동으로 , 실제 배포는 사람의 승인 
   - 검사를 통과하면 실제 서버 배포까지 자동으로 해준다.
   - 만든 JAR를 EC2에 올리고 프로그램을 다시 실행한다.

자동화만드는 첫번째 방법 
.github 깃허브에서 사용할 설정 파일을 모아두는 폴더!
        없으면 만들어야 한다. 

 workflows     
    - 정해진 이름이라 변경하면 안된다! 
    - 자동으로 실행할 작업들을 넣는 폴더!

    deploy.yml
    - 파일명은 아무거나 해도된다. 
    - yml == yaml 똑같은 파일형식 key: value 형태(띄어쓰기 잘 해야됨)
    
*/