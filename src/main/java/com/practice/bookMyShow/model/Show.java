package com.practice.bookMyShow.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Show {
    private Movie movie;
    private String startTime;
    private String endTime;
    private Screen screen;
}
