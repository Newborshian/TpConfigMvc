package com.example.projetconfigmvc.test;

import com.example.projetconfigmvc.presentation.Vue;

public class TestMain2 {

    public static void main(String[] args) {
        Vue vue = new Vue();
//		vue.createClient();
//		vue.showAllClients();
//		vue.showClient(0);
        int choice = 0;
        do {
            choice = vue.afficherMenu();
            switch (choice) {
                case 0:
                    vue.exit();
                    break;
                case 1:
                    vue.createClient();
                    break;
                case 2:
                    vue.showClient();
                    break;
                case 3:
                    vue.showAllClients();
                    break;

                default:
                    System.err.println("this option does not exist");
                    break;
            }
        } while (choice != 0);
    }
}
