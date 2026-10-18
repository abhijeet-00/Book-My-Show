package com.practice.bookMyShow.model;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Theater {
    private String theaterName;
    private List<Screen> screens;
}
