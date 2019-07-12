package org.dimigo.thread.Subject19;

public class Runner extends Thread{
    private String name;


    public Runner(){}

    public Runner(String name) {
        this.name = name;
    }

    public void run(){
        for(int i =90;i>=0;i-=10){
            System.out.println(name + " " + i + " 미터");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(name + " 골인");
    }

}
