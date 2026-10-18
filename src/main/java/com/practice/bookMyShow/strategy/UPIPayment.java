package com.practice.bookMyShow.strategy;

import com.practice.bookMyShow.model.User;

public class UPIPayment implements Payment{
    @Override
    public boolean pay(User user, double price) {
        // UPI payment implementation
        return true;
    }
}
