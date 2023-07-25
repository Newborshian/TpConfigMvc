package com.example.projetconfigmvc.service;

import com.example.projetconfigmvc.entities.Customer;
import com.example.projetconfigmvc.persistance.CustomerDAO;
import com.example.projetconfigmvc.persistance.MemoryCustomerDAO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Getter
@Setter
@Component
public class ServiceImplementation implements CustomerService{

    private CustomerDAO dao = new MemoryCustomerDAO();


    @Autowired
    @Override
    public void addCustomer(Customer c) {

        if (c != null) {
            dao.save(c);
        }
    }

    @Override
    public Customer findValidatedCustomer(int id) {

        return dao.findById(id);
    }
    @Autowired
    @Override
    public List<Customer> getAllCustomer() {

        return dao.findAll();
    }

    @Override
    public void deleteCustomer(int id) {
        dao.delete(id);

    }

    public ServiceImplementation() {
    }

    public ServiceImplementation(CustomerDAO dao) {
        this.dao = dao;
    }
}
