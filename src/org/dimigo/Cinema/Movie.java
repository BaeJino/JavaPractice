package org.dimigo.Cinema;

public class Movie {
    private String title;
    private int LimitAge;

    public Movie(String title, int limitAge) {
        this.title = title;
        LimitAge = limitAge;
    }

    public String getTitle() {
        return title;
    }

    public int getLimitAge() {
        return LimitAge;
    }

    public void buyTicket(int age){
        try {
            if(age < 15){
            throw new Exception(title + "은/는 15세 이상 관람가입니다.");}


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}
