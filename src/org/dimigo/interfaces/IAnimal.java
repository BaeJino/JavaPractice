package org.dimigo.interfaces;

//인터페이스는 다 추상메소드 , 상수
public interface IAnimal {

    public static final String FARM_NAME = "디미 농물농장";
    String FARM_NAME2 = "디미 농물농장2";
    //알아서  pubclic static final이 자동으로 붙음

    //모든 메소드는 추상 메소드 (JDK7 까지)
    //public abstract void eat();
    //abstract void sleep(); //자동으로 public 이 붙는다

    //공통된 코드가 있을 때 default 추가
    //디폴트 메소드 (JDK 8)
    default void eat(){
        System.out.println("냠냠");
    }
    default void sleep(){
        System.out.println("쿨쿨");
    }

    void bark(); //자동으로 public abstract 까지 붙음

    public static void welcome(){
        System.out.println(FARM_NAME + "에 오신걸 환영합니다.");
    }
}
