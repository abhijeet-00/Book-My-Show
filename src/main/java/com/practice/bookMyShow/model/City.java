package com.practice.bookMyShow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class City {
    private String cityName;
    private List<Theater> theaters;
}
