package com.example.projetconfigmvc.presentation;

import com.example.projetconfigmvc.entities.Customer;
import com.example.projetconfigmvc.service.CustomerService;
import com.example.projetconfigmvc.service.ServiceImplementation;

import java.util.List;
import java.util.Scanner;

public class Vue {
    private CustomerService cs = new ServiceImplementation();
    Scanner scanner = new Scanner(System.in);

    public void showClient(int id) {
        Customer c = cs.findValidatedCustomer(id);
        System.out.println(c);
    }

    public void showClient() {
        System.out.println("enter ID:");
        int val = scanner.nextInt();
        scanner.nextLine();
        Customer c = cs.findValidatedCustomer(val);
        System.out.println(c);
    }

    public int afficherMenu() {
        System.out.println("0 : exit, 1-create, 2-show client, 3-show all clients");
        System.out.println(scanner.hasNextInt());
        int val = scanner.nextInt();
        scanner.nextLine();
        System.out.println("val = "+val);
        return val;
    }

    public void showAllClients() {
        List<Customer> allCustomer = cs.getAllCustomer();
        System.out.println(allCustomer);

    }

    public void createClient() {

        System.out.println("==== Create a client ====");
        System.out.println("Name : ");
        System.out.println(scanner.hasNextLine());
        String name = scanner.nextLine();
        Customer c = new Customer(name);
        cs.addCustomer(c);
        System.out.println("Client is created");


    }

    public void exit() {
        System.out.println("bye !");;
        scanner.close();

    }
}
