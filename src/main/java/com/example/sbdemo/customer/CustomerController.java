package com.example.sbdemo.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/customer")
public class CustomerController {
    @GetMapping
    public List<Customer> getCustomers() {
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
