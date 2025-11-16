package com.springbootacademy.pos.service;

import com.springbootacademy.pos.dto.CustomerDTO;
import com.springbootacademy.pos.dto.request.CustomerUpdateDTO;

public interface CustomerService {


    public String saveCustomer(CustomerDTO customerDTO);

    String updateCustomer(CustomerUpdateDTO customerUpdateDTO);

    CustomerDTO getCustomerById(int customerId);
}
