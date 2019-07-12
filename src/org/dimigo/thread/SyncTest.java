package org.dimigo.thread;

public class SyncTest {
    //Synchronized 동시에 발생하는
    //Synchronized 쓰레드 락 , 쓰레드 동기화 방법
    //열쇠를 획득한 쓰레드만이 실행되게 하는 것
    //방법 1. 메소드에 동기화 전체
    //방법 2. Synchronized 블록 작성해서 범위 정하기

    private int data;

    private synchronized void add(){
        for(int i =0 ;i<10000;i++){
            data++;
        }
    }

    public static void main(String[] args) {
        SyncTest s = new SyncTest();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println(name + " start");
                s.add();
                System.out.println(name + " end");

            }

        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println(name + " start");
                s.add();
                System.out.println(name + " end");

            }

        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("data => "+ s.data);
    }
}


