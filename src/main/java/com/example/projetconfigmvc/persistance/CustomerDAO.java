package com.example.projetconfigmvc.persistance;

import com.example.projetconfigmvc.entities.Customer;

import java.util.List;

public interface CustomerDAO {

    public void save(Customer c);

    public Customer findById(int id);

    public void delete(int id);

    public List<Customer> findAll();
}
