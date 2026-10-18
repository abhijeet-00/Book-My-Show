package com.practice.bookMyShow.model;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Screen {
    private String screenName;
    private List<Seat> seats;
}
