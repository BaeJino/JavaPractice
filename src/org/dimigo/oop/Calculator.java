package org.dimigo.oop;

public class Calculator {
    /*(static없는)인스턴스 필드(객체화 해야 사용할 수 있는 필드) Calcurator c = new Calcurator 해주어야 사용 가능*/
    private int num1;
    private int num2;
    private boolean powerFlag;


    public Calculator(){}

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /*(static 없는)인스턴스 메소드(객체가 존재해야 사용 할 수 있는 메소드)*/
    public void powerOn(){
        if(!powerFlag) {
            System.out.println("전원을 켭니다.");
            powerFlag = true;
        }
        else
        {
            System.out.println("이미 전원이 켜져있습니다.");
        }
    }

    public void powerOff(){
        if(powerFlag) {
            System.out.println("전원을 끕니다.");
            powerFlag = false;
        }
        else{
            System.out.println("이미 전원이 꺼져있습니다.");
        }
    }

    public int add(){
        powerOn();
        return num1 + num2;
    }

    public int sub(){
        powerOn();
        return num1 - num2;
    }

    public int mul(){
        powerOn();
        return num1 * num2;
    }

    public double div(){
        powerOn();
        return (double)num1 / num2;
    }

}
