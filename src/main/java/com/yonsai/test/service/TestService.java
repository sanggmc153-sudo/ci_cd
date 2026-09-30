package com.yonsai.test.service;

import org.springframework.stereotype.Service;

@Service 
public class TestService {
    
   public int add(int a, int b){
        return a + b;

    }

   public boolean login(String id, String pw) {
    return id.equals("admin") &&
        pw.equals("admin11!");
   }
}
