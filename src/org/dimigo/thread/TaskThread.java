package org.dimigo.thread;

public class TaskThread extends Thread {

    //run 메소드 오버라이딩
    @Override
    public void run(){
        String threadname = Thread.currentThread().getName();
        System.out.println(threadname + " start");

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(threadname + " end");

    }
}
