package com.spring.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService implements UserInterface {
    private Double balance;

    public UserService(){
        this.balance=0d;
    }
    
    @Override
    public Double getBalance() {
        return this.balance;
    }

    @Override
    public void setBalance(Double balance) {
        this.balance=balance;
    }

    @Override
    public void addBalance(Double credit) {
        this.balance+=credit;
    }

    @Override
    public void decreaseBalance(Double credit) {
        this.balance-=credit;
    }
    
}
