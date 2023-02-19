package com.spring.repository;

import com.spring.model.Produit;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
/*
       List<Produit> listprod = new ArrayList() {{
        add(new Produit("Mars", 2.0, 10));
        add(new Produit("Lyon", 3.0, 20));
        add(new Produit("Ice Tea", 2.0, 15));
    }};
*/
}
