package org.dimigo.phone;

public class SmartPhoneTest{
    public static void main(String[] args) {

        SmartPhone[] phones = {
                new IPhone("iPhone XS", "애플", 1370000),
                new Galaxy("갤럭시 S10","삼성",1500000)
        };

        for(SmartPhone a : phones){
            System.out.println(a);
            a.turnOn();
            a.pay();
            a.useSpecialFunction();
            a.turnOff();
        }

    }

}
