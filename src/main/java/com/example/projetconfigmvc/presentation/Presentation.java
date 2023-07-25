package com.example.projetconfigmvc.presentation;

import com.example.projetconfigmvc.config.ConfigurationExplicite;
import com.example.projetconfigmvc.entities.Customer;
import com.example.projetconfigmvc.service.CustomerService;
import com.example.projetconfigmvc.service.ServiceImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Presentation {
    public static void main(String[] args) {

        // Initialisations
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationExplicite.class);
        ServiceImplementation serviceImplementation = context.getBean("serviceImplementation", ServiceImplementation.class);

        Customer c1 = null;
        Customer c2 = new Customer("Albert Einstein");
        Customer c3 = new Customer("Giordano Bruno");

        // Scenario
       serviceImplementation.addCustomer(c1);
       serviceImplementation.addCustomer(c2);
       serviceImplementation.addCustomer(c3);

        System.out.println(serviceImplementation.getAllCustomer());


    }

}
