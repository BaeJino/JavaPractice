package org.dimigo.thread;

public class SingleThread {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        //현재 실행중인 Thread 가지고 오기
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " thread start");

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(t.getName() + " thread end");

        long end = System.currentTimeMillis();
        System.out.println("실행 시간 : " + (end - start));


    }
}
