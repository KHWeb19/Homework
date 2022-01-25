package com.example.bank;

import com.example.bank.controller.HomeworkController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
		HomeworkController hwController = new HomeworkController();
		hwController.run();
	}

}
