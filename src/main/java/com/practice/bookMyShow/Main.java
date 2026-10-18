package com.practice.bookMyShow;

import com.practice.bookMyShow.model.*;
import com.practice.bookMyShow.strategy.UPIPayment;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to BookMyShow!");
        User user1 = new User("John Doe", "john.doe@example.com");
        User user2 = new User("Raj Shamani", "raj@gmail.com");
        List<Seat> seats = List.of(
                new Seat("A1", SeatType.GOLD),
                new Seat("A2", SeatType.PREMIUM)
        );
        List<Seat> seats2 = List.of(
                new Seat("B1", SeatType.GOLD),
                new Seat("B2", SeatType.PREMIUM)
        );
        Screen screen1 = new Screen("Screen 1", seats);
        Screen screen2 = new Screen("Screen 2", seats2);
        List<Show> shows = List.of(
                new Show(new Movie("Avengers: Endgame", List.of("Robert Downey Jr.", "Chris Evans")), "2023-10-01 19:00", "2023-10-01 22:00", screen1),
                new Show(new Movie("Inception", List.of("Leonardo DiCaprio")), "2023-10-02 20:00", "2023-10-02 23:00", screen2));
        List<Theater> theaters = List.of(new Theater("PVR Cinemas", List.of(screen1, screen2)));
        List<City> cities = List.of(new City("New York", theaters));
        BookMyShowController bookMyShowController = new BookMyShowController(new BookMyShow(cities, new UPIPayment()));
        Ticket ticket = bookMyShowController.bookTicket(user1, List.of(new ShowSeat(shows.get(0), seats.get(0), 200, ShowSeatStatus.AVAILABLE)));
        System.out.println("Ticket booked successfully: " + ticket);
    }
}