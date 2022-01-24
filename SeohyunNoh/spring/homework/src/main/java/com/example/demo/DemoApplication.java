package com.example.demo;

import com.example.demo.controller.Bank7Pro;
import com.example.demo.controller.ThreadTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	Thread t1 = new Thread(new ThreadTest());

	// ThreadTest 객체를 Thread()에 넣고 t1에 넣었는데
	// 왜 start()가 빨간 줄 뜰까?
	// t1.start();
}
