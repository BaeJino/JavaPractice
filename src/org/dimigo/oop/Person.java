package org.dimigo.oop;

public class Person {
    public static final String SPECIES = "포유류";
    //final == constant 상수 , 바뀌지 않음
    private final String birthDate;
    private String name;

    public Person(String birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }


    public static void main(String[] args) {
        Person p1 = new Person("20020319", "배진호");
        Person p2 = new Person("20020319", "김종수");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(Person.SPECIES);
    }
}