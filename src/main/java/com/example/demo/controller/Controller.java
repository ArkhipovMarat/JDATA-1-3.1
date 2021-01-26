package com.example.demo.controller;

import com.example.demo.repository.CustomersRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private CustomersRepository customersRepository;

    public Controller(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductsByCustomer(@RequestParam String name) {
       return customersRepository.getProductsByCustomer(name);
    }
}
