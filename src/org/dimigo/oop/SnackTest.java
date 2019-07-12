package org.dimigo.oop;

public class SnackTest {
    public static void main(String[] args) {
        Snack[] snArr = new Snack[3];
        snArr[0] = new Snack("새우깡","농심",1100,2);
        snArr[1] = new Snack("콘칲","크라운",1200,1);
        snArr[2] = new Snack("허니버터칩","해태",1500,4);

        int total = 0;
        for(int i = 0 ; i<3;i++) {
            System.out.println(snArr[i].toString());
            System.out.println();

            total += snArr[i].calPrice();
            //snArr[i]. 으로 어디에 있는 메소드인지 알려주기.

        }


        System.out.printf("총 구매 금액 : %,d원",total);
    }



}
