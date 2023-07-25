package com.example.projetconfigmvc.test;

import com.example.projetconfigmvc.config.ConfigurationExplicite;
import com.example.projetconfigmvc.entities.Customer;
import com.example.projetconfigmvc.presentation.Vue;
import com.example.projetconfigmvc.service.ServiceImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    public static void main(String[] args) {

        Vue vue = new Vue();
        vue.createClient();
        vue.showAllClients();
        vue.exit();

    }
}
