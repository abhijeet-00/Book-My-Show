package com.practice.bookMyShow;

import com.practice.bookMyShow.model.BookMyShow;
import com.practice.bookMyShow.model.ShowSeat;
import com.practice.bookMyShow.model.Ticket;
import com.practice.bookMyShow.model.User;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class BookMyShowController {
    private BookMyShow bookMyShow;
    Ticket bookTicket(User user, List<ShowSeat> showSeats) {
        Ticket ticket = bookMyShow.bookSeat(user, showSeats);
        if (ticket == null) {
            throw new RuntimeException("Sorry ticket is not booked");
        }
        return ticket;
    }
}
