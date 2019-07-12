package org.dimigo.oop;

import java.util.*;


public class Shoppingbasket {
    private String name;
    private int price;
    private int amount;
    private String company;
    private String owner;

    public void order(String name) {
        System.out.println(name + "상품을 주문합니다!");
    }

    public void gift(String name) {
        System.out.println(name + "상품을 선물합니다!");
    }


    public void mileage(int mileage) {
        System.out.println("마일리지" + mileage + "원을 사용합니다!");
    }

    public boolean productdelete() {
        System.out.println("상품을 삭제합니다!");
        return true;
    }

    public boolean productsave() {
        System.out.println("상품을 보관합니다!");
        return true;
    }

}