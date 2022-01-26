package com.example.demo;

import com.example.demo.utillity.Raito;
import com.example.demo.utillity.Score;
import com.example.demo.utillity.thread.RaitoThread;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.print("원하는 자리를 입력해주세요 : ");
		int num = scanner.nextInt();

		 */
		RaitoThread rt = new RaitoThread();
		rt.start();

		SpringApplication.run(DemoApplication.class, args);
	}

}
