package org.dimigo.thread.Subject19;

public class Race extends Thread{
    public static void main(String[] args) {

        Thread t1 = new Runner("A선수");
        Thread t2 = new Runner("B선수");

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
