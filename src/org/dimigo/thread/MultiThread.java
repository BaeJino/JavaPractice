package org.dimigo.thread;

public class MultiThread {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Thread t = Thread.currentThread();
        System.out.println(t.getName()+ " start");

        Thread t1 = new TaskThread();
        Thread t2 = new TaskThread();

        t1.start();
        //t1.run() 으로 해야 할 것 같지만 그렇게 하면
        //순차적으로 실행되어 싱글스레드 방식으로 동작됨
        t2.start();

        try{
            //t1과 t2의 Thread가 끝날 때 까지 기다려라
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t.getName() + " end");

        long end = System.currentTimeMillis();
        System.out.println("실행 시간 : " + (end-start));

        //원래 2초 2초씩 4초가 걸려야 함 (싱글스레드)
        //멀티쓰레드 사용하니 병렬로 실행되서 약 2초걸림

    }
}
