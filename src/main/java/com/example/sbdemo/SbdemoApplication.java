package com.example.sbdemo;

import com.example.sbdemo.customer.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@SpringBootApplication

public class SbdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbdemoApplication.class, args);

	}


}
