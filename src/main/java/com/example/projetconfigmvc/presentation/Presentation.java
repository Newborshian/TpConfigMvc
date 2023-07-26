package com.example.projetconfigmvc.presentation;

import com.example.projetconfigmvc.config.ConfigurationImplicite;
import com.example.projetconfigmvc.entities.Customer;
import com.example.projetconfigmvc.service.CustomerService;
import com.example.projetconfigmvc.service.ServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Presentation {

      private static CustomerService customerService = new ServiceImplementation();

        public static void main(String[] args) {


            Customer c = new Customer();
            Customer c2 = new Customer("jean");
            Customer c3 = new Customer("marc");

            customerService.addCustomer(c);
            customerService.addCustomer(c2);
            customerService.addCustomer(c3);


            System.out.println(customerService.getAllCustomer());

        }

}
