package org.dimigo.oop;

public class Calculator2 {

    private boolean powerFlag;
    public static double PI = 3.141592;

    public void powerOn() {
        if (!powerFlag) {
            System.out.println("전원을 켭니다.");
            powerFlag = true;
        } else {
            System.out.println("이미 전원이 켜져있습니다.");
        }
    }

    public void powerOff() {
        if (powerFlag) {
            System.out.println("전원을 끕니다.");
            powerFlag = false;
        } else {
            System.out.println("이미 전원이 꺼져있습니다.");
        }
    }

    public static int add(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1 + num2;
    }

    public static int sub(int num1, int num2, Calculator2 c) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2, Calculator2 c) {
        return num1 * num2;
    }

    public static double div(int num1, int num2, Calculator2 c) {
        return (double) num1 / num2;
    }
}
