package com.practice.bookMyShow.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@ToString
public class Ticket {
    private String ticketNumber;
    private List<ShowSeat> showSeats;
    private User user;
}
