package com.spring;

import com.spring.model.Produit;
import com.spring.service.ProduitService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// Equivalent de
// @SpringBootConfiguration
// @EnableAutoConfiguration
//@ComponentScan(basePackages = {"fr.m2i.spring.lesson", "fr.m2i.data"})
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        ProduitService produitService = ctx.getBean(ProduitService.class);
        produitService.Create(new Produit("Mars", 2.0, 10));
        produitService.Create(new Produit("Mars", 2.0, 10));
    }
}
