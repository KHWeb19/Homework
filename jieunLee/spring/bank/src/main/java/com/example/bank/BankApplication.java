package com.example.bank;

import com.example.bank.controller.bank7.Bank7Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);



		Bank7Controller hwController = new Bank7Controller();
		hwController.run();
	}

}
