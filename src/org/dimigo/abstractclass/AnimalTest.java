package org.dimigo.abstractclass;

public abstract class AnimalTest {
    public static void main(String[] args) {
        Animal[] a = {
                new Duck(),new Cow(),new Pig()
        };

        System.out.println("=== 평온한 동물 농장 ===");
        for(Animal s : a){
            s.eat();
        }

        System.out.println("정하진이 나타났다.");
        for(Animal s : a){
            s.bark();
        }


    }
}
