package com.practice.bookMyShow.strategy;

import com.practice.bookMyShow.model.User;

public interface Payment {
    boolean pay(User user, double price);
}
