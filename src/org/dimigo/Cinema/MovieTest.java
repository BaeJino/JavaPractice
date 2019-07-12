package org.dimigo.Cinema;

public class MovieTest {
    public static void main(String[] args) {

        Movie[] movies = {
                new Movie("걸캅스", 15),
                new Movie("어벤져스 : 엔드게임", 12)
        };

        int age = 13;
        for (Movie a : movies) {
            a.buyTicket(age);
        }
    }
}
