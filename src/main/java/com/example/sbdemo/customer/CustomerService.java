package com.example.sbdemo.customer;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class CustomerService {

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
