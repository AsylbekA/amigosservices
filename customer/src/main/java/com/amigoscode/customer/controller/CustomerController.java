package com.amigoscode.customer.controller;


import com.amigoscode.customer.models.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    @PostMapping()
    public void  registerCustomer(@RequestBody CustomerRegistrationRequest customer){

    }
}
