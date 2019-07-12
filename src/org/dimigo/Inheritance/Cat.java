package org.dimigo.Inheritance;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    //부모 클래스의 메소드를 자식 클래스에서 재정의함.
    //메소드 오버라이딩
    public void bark(){
        System.out.println("냐옹");
    }
}
