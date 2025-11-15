package com.springbootacademy.pos.controller;


import com.springbootacademy.pos.dto.CustomerDTO;
import com.springbootacademy.pos.dto.request.CustomerUpdateDTO;
import com.springbootacademy.pos.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customers")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public String savecustomer(@RequestBody CustomerDTO customerDTO){
        //String message= customerDTO.getCustomerName();
        //return message;

        customerService.saveCustomer(customerDTO);
        return "Customer Saved";

    }

    @PutMapping("/update")
    public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO){
        customerService.updateCustomer(customerUpdateDTO);
        return "Customer Updated";

    }

}
