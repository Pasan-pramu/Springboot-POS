package com.springbootacademy.pos.service.impl;

import com.springbootacademy.pos.dto.CustomerDTO;
import com.springbootacademy.pos.dto.request.CustomerUpdateDTO;
import com.springbootacademy.pos.entity.Customer;
import com.springbootacademy.pos.repo.CustomerRepo;
import com.springbootacademy.pos.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIMPL  implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;


    @Override
    public String saveCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer(
                customerDTO.getCustomerId(),
                customerDTO.getCustomerName(),
                customerDTO.getCustomerAddress(),
                customerDTO.getCustomerSalary(),
                customerDTO.getCustomerNumber(),
                customerDTO.getNic(),
                customerDTO.isActive()

        );

        customerRepo.save(customer);
        return  customerDTO.getCustomerName();
    }

    @Override
    public void updateCustomer(CustomerUpdateDTO customerUpdateDTO) {

    }

}
