package com.practice.bookMyShow.model;

import com.practice.bookMyShow.strategy.Payment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class BookMyShow {
    private List<City> cities;
    private Payment payment;
    public Ticket bookSeat(User user, List<ShowSeat> showSeats) {
        double priceToPay = 0.0;
        for (ShowSeat showSeat : showSeats) {
            if (showSeat.getStatus().equals(ShowSeatStatus.BOOKED) || showSeat.getStatus().equals(ShowSeatStatus.LOCKED)) {
                throw new RuntimeException("Selected seat is not available " + showSeat);
            } else {
                showSeat.setStatus(ShowSeatStatus.LOCKED);
                priceToPay += showSeat.getPrice();
            }
        }
        if (payment.pay(user, priceToPay)) {
            for (ShowSeat showSeat : showSeats) {
                showSeat.setStatus(ShowSeatStatus.BOOKED);
            }
            String ticketNumber = UUID.randomUUID().toString();
            return new Ticket(ticketNumber, showSeats, user);
        } else {
            for (ShowSeat showSeat : showSeats) {
                showSeat.setStatus(ShowSeatStatus.AVAILABLE);
            }
        }
        return null; // Return null if no seat is available
    }
}
