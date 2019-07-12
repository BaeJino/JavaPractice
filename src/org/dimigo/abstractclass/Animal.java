package org.dimigo.abstractclass;

//클래스에 추상화 - 그 클래스로 객체 생성 불가
public abstract class Animal {

    public void eat(){
        System.out.println("냠냠");
    }


    //반드시 오버라이딩 하라고 강제화 시키는 것
    public abstract void bark();
}
