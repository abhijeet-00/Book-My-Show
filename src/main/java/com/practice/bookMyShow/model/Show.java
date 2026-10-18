package com.practice.bookMyShow.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Date;

@AllArgsConstructor
@ToString
public class Show {
    private Movie movie;
    private String startTime;
    private String endTime;
    private Screen screen;
}
