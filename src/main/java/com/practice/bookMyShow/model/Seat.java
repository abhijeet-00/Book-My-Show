package com.practice.bookMyShow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Seat {
    private String seatNumber;
    private SeatType seatType;
}
