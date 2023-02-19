package com.spring.controller;

import com.spring.model.Produit;
import com.spring.service.UserForm;
import com.spring.repository.ProduitRepository;
import com.spring.service.BuyForm;
import com.spring.service.ProduitService;
import com.spring.service.UserService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DistributeurController {

    private ProduitService produitService;
    private UserService userService;

    @Autowired
    public DistributeurController(ProduitService produitService, UserService userService) {
        this.produitService = produitService;
        this.userService = userService;
    }

    @RequestMapping(value = "/distrib", method = RequestMethod.GET)
    public String distrib(ModelMap model) {
        model.addAttribute("stock", produitService.findAll());
        model.addAttribute("balance", userService.getBalance());
        model.addAttribute("userForm", new UserForm());
        model.addAttribute("buyForm", new BuyForm());
        return "distrib";
    }

        @RequestMapping(value = "/addCredit", method = RequestMethod.POST)
    public String addCredit(@ModelAttribute("userForm") @Valid UserForm userForm) {
        userService.addBalance(userForm.getCreditToAdd());
        return "redirect:distrib";
    }
    
    @RequestMapping(value = "/buyProduct", method = RequestMethod.POST)
    public String buyProduct(@ModelAttribute("buyForm") @Valid BuyForm buyForm) {
       // produitService.
        return "redirect:distrib";
    }
}
