package org.dimigo.Inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("아무개");
        System.out.println(a);
        a.bark();
        a.eat();
        a.sleep();

        Dog d = new Dog("강아지");
        System.out.println(d);
        d.bark();
        d.eat();
        d.sleep();
        d.wag();

        Cat c = new Cat("고양이");
        System.out.println(c);
        c.eat();
        c.sleep();
        c.bark();

        Tiger t = new Tiger("호랑이");
        System.out.println(t);
        t.eat();
        t.sleep();
        t.bark();
        t.hunt();


        Animal[] animals = {
                new Dog("멍멍이"),
                new Cat("야옹이"),
                new Tiger("호돌이")
        };

        for(Animal s : animals) {
            doBark(s);
        }
        System.out.println("11");
        Animal a2 = new Cat("냐옹이");
        a2.eat();
        a2.sleep();
        a2.bark();

        ((Cat) a2).bark();

        Animal dog = new Dog("멍멍이");
        Animal cat = new Cat("냐옹이");

        System.out.println(dog instanceof Dog);
        System.out.println(cat instanceof Cat);
        System.out.println(dog instanceof Cat);
        System.out.println(cat instanceof Dog);
        System.out.println(dog instanceof Animal);
        System.out.println(cat instanceof Animal);

        doBark(dog);
        doBark(cat);

    }


    private static void doBark(Animal s) {
        if (s instanceof Dog) {
            ((Dog) s).wag();
        } else if (s instanceof Cat) {
            ((Cat)s).bark();

        }
    }
}
