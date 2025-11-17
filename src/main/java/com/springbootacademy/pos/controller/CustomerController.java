package com.springbootacademy.pos.controller;


import com.springbootacademy.pos.dto.CustomerDTO;
import com.springbootacademy.pos.dto.request.CustomerUpdateDTO;
import com.springbootacademy.pos.entity.Customer;
import com.springbootacademy.pos.repo.CustomerRepo;
import com.springbootacademy.pos.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping("/save")
    public String savecustomer(@RequestBody CustomerDTO customerDTO) {
        //String message= customerDTO.getCustomerName();
        //return message;

        customerService.saveCustomer(customerDTO);
        return "Customer Saved";

    }

    @PutMapping("/update")
    public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO) {
        String message = customerService.updateCustomer(customerUpdateDTO);
        return message;

    }


    @GetMapping(
            path = "/get-by-id",
            params = "id"
    )
    public CustomerDTO getCustomerById(@RequestParam(value = "id") int customerId) {

        CustomerDTO customerDTO = customerService.getCustomerById(customerId);
        return customerDTO;

    }

        @GetMapping(
                path="get-all-customers"
        )
    public List<CustomerDTO> getAllCustomers(){
        List<CustomerDTO>allCustomers= customerService.getAllCustomers();
        return allCustomers;
        }


        @DeleteMapping(
                path="delete-customer/{id}"
        )

    public String deleteCustomer(@PathVariable (value="id") int customerId){

        String deleted =  customerService.deleteCustomer(customerId);
        return  deleted;
        }
    }













