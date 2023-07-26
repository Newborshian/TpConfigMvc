package com.example.projetconfigmvc;

import com.example.projetconfigmvc.entities.Customer;
import com.example.projetconfigmvc.persistance.CustomerDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.util.AssertionErrors.assertTrue;


@SpringBootTest
class ProjetConfigMvcApplicationTests {

    @Autowired
    private CustomerDAO customerDAO;



    @Test
    void testSaveCustomersWithNull() {

        // Vérifier qu'il y a exactement deux clients enregistrés (en excluant le client nul)
        assertEquals(2, customerDAO.findAll().size());
    }

}
