package org.dimigo.thread.Subject20;

public class Accout {
    public int balance;

    public Accout(int balance) {
        this.balance = balance;
    }

    public synchronized void deposit(int money){
        balance = balance + money;
        System.out.println(money + "원 입금 => 현재 잔액 : " + balance);
    }

    public synchronized void withdraw(int money){
        balance = balance - money;
        System.out.println(money + "원 출금 => 현재 잔액 : " + balance);

    }
}
