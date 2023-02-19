package com.spring.service;

import com.spring.model.Produit;
import com.spring.repository.ProduitRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProduitService implements ProduitInterface {

    private ProduitRepository produitRepository;

    @Autowired
    public ProduitService(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    public List<Produit> findAll() {
        return produitRepository.findAll();
    }

    public Produit findById(long id) {
        return produitRepository.
    }

    public void Create(Produit prod) {
        produitRepository.save(prod);
    }
 
    public void buyProduct(long id){
      Produit prod= produitRepository.findById(id);
      prod.setQuantite(prod.getQuantite()-1);
    }

}
