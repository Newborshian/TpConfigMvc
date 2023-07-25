package com.example.projetconfigmvc.test;

import com.example.projetconfigmvc.presentation.Vue;

public class TestMain {

    public static void main(String[] args) {

        Vue vue = new Vue();
        vue.createClient();
        vue.showAllClients();
        vue.exit();

    }
}
