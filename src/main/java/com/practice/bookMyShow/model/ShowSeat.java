package com.practice.bookMyShow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ShowSeat {
    private Show show;
    private Seat seat;
    private double price;
    private ShowSeatStatus status;
}
