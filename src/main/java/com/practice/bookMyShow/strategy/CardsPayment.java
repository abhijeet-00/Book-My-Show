package com.practice.bookMyShow.strategy;

import com.practice.bookMyShow.model.User;

public class CardsPayment implements Payment{
    @Override
    public boolean pay(User user, double price) {
        return false;
    }
}
