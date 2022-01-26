package com.example.demo;

import com.example.demo.utility.thread.ThreadWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ThreadWorker tw = new ThreadWorker(); //Thread를 상속받은 클래스 ThreadWorker의 객체 생성
		tw.start();
		// Requestmapping할 때마다 스레드를 만들지 않도록 Thread부분은 main에 위치

		SpringApplication.run(DemoApplication.class, args);
	}
}
