package org.dimigo.basic.oop2;

public class Car {
    private static String company; //회사명은 다 공통된 걸 씀 정적 필드
    private String name; //인스턴스 필드

    //static block

    static {
        company = "기아";
        System.out.println("static block 호출");
    }
    public Car(String name) {
        System.out.println("생성자 호출");
        this.name = name;
    }


    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Car.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return company + " : " + name;
    }
}
