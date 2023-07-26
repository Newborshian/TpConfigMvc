package com.example.projetconfigmvc.presentation;

import com.example.projetconfigmvc.config.ConfigurationImplicite;
import com.example.projetconfigmvc.entities.Customer;
import com.example.projetconfigmvc.service.ServiceImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Presentation {
    public static void main(String[] args) {
            // we start spring
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationImplicite.class);
            // we ask for bean
            Customer c = new Customer();
            Customer c2 = new Customer();
            Customer c3 = new Customer();

            c.setName("Bob");
            c2.setName("Dylan");
            c3.setName("Mary");

            ServiceImplementation s = context.getBean("serviceImplementation", ServiceImplementation.class);

            s.addCustomer(c);
            s.addCustomer(c2);
            s.addCustomer(c3);

            // read all customers
            System.out.println("Les customers du modele implicite sont : ");
            List<Customer> list = s.getAllCustomer();
            System.out.println(list);

            System.out.println("Find customer with id 1");
            Customer validatedCustomer = s.findValidatedCustomer(1);
            System.out.println(validatedCustomer);
            validatedCustomer.getName();
            List<Customer> list2 = s.getAllCustomer();
            System.out.println("On supprimer customer c. Voici la liste aprés suppression : " + list2);

            // we free resources
            ((ConfigurableApplicationContext) context).close();
        }

}
