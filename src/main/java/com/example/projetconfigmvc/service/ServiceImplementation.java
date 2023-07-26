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



    @Autowired
    private CustomerDAO dao;


    @Override
    public void addCustomer(Customer c) {
        if (c != null && (c.getName() != null && c.getName().isEmpty())) {
            dao.save(c);
        }
    }

    @Override
    public Customer findValidatedCustomer(int id) {

        return dao.findById(id);
    }

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
