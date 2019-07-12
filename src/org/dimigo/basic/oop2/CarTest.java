package org.dimigo.basic.oop2;

public class CarTest {
    public static void main(String[] args) {
        Car [] cars = {
                new Car("제네시스"),
                new Car("그랜져"),
                new Car("아반떼"),
        };

        //Car.setCompany("현대");
        for(Car car : cars) {
            System.out.println(car);
        }

        System.out.println(Integer.parseInt("500"));

    }
}
