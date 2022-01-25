package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
	서비스를 만드는 두 가지 개념? 서버와 고객(client)
	우리가 구동시긴 spring boot 서버는 말 그대로 server에 해다왑니다.
	우리가 만든 controller에 url을 요청하는 모든 사용자들

 */

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
