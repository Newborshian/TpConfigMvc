package com.example.projetconfigmvc.service;

import com.example.projetconfigmvc.entities.Customer;
import org.springframework.stereotype.Component;

import java.util.List;


public interface CustomerService {
    public void addCustomer(Customer c);

    public Customer findValidatedCustomer(int id);

    public List<Customer> getAllCustomer();

    public void deleteCustomer(int id);

}
