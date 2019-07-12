package org.dimigo.oop;

public class Singleton {
    private static Singleton instance = new Singleton();



    //원래 public Singleton()
    //밖에서 불러오지 못하게 막아줌
    private Singleton() {
    }

    public static Singleton getInstance(){
        return instance;
    }

    public static Singleton getInstance2(){  //lazy 게으른
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
