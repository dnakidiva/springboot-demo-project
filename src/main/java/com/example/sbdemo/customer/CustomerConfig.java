package com.example.sbdemo.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@Configuration
public class CustomerConfig {
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository){
    return args ->{
        Customer natalie = new Customer(
                "Natalie",
                "natalie.adisa@gmail.com",
                LocalDate.of(2000, Month.JUNE, 23)
        );


        Customer jamie = new Customer(
                "Jamie",
                "jamie.kanji@gmail.com",
                LocalDate.of(2000, Month.AUGUST, 25)
        );

        repository.saveAll(
                List.of(natalie,jamie)
        );
    };
    }
}
