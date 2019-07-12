package org.dimigo.oop;

public class PiggyBank {
    private static int balance = 0;

    public static void putMoney(FamilyMember member,int amount){
        balance += amount;
        System.out.printf("%s : %,d원 넣음\n", member.getName(), amount);
    }

    public static void  printBalance(){
        System.out.printf("돼지저금통 총 금액 : %,d원\n", balance);
    }


}