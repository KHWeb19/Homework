package com.example.demo;

import com.example.demo.Bank8_2.Average;
import com.example.demo.utility.Sequence;
import com.example.demo.utility.ThreadWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	ThreadWorker tw=new ThreadWorker(); //컨트롤러에서 하면 객체가 계속 생성되기 된다
	tw.start();

	Sequence sq=new Sequence(2,21); //여기서 값을 넣게 된다



	}
}
