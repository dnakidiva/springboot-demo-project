package com.example.sbdemo.customer;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table
    public class Customer {

        @Id
        @SequenceGenerator(
                name = "customer_sequence",
                sequenceName = "customer_sequence",
                allocationSize = 1
        )
        @GeneratedValue(
                strategy = GenerationType.SEQUENCE,
                generator = "customer_sequence"
        )

        private Long id;
        private String name;
        private String email;
        private LocalDateTime dob;
        private Integer age;

        public Customer() {
        }

        public Customer(Long id,
                        String name,
                        String email,
                        LocalDateTime dob,
                        Integer age) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.dob = dob;
            this.age = age;
        }

        public Customer(String name, String email, LocalDateTime dob, Integer age) {
            this.name = name;
            this.email = email;
            this.dob = dob;
            this.age = age;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public LocalDateTime getDob() {
            return dob;
        }

        public void setDob(LocalDateTime dob) {
            this.dob = dob;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
