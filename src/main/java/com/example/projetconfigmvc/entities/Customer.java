package com.example.projetconfigmvc.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class Customer {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "(" + id + ")" + name;
    }

    public Customer() {
    }
    public Customer(String name) {
        this.name = name;
    }
}
