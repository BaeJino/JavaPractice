package org.dimigo.thread.Subject20;

//출력이 뒤죽박죽이 아니라 순서대로 되도
//맞게 코딩을 한것인가?
public class AccoutTest{
    public static void main(String[] args) {
        Accout a = new Accout(10000);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<5;i++){
                    a.deposit(2000);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<3;i++){
                    a.withdraw(3000);
                }
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

        System.out.println("최종 잔액 : " + a.balance);


    }
}
