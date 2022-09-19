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
@RestController
public class SbdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbdemoApplication.class, args);

	}

   @GetMapping
	public List<Customer> hello() {
		return List.of(
				new Customer(
						23L,
						"Natalie",
						"natalie.adisa@gmail.com",
						LocalDateTime.of(2000, Month.JUNE,23,7,30),
						22

				)
		);
	}
}
