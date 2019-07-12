package org.dimigo.inheritance2;

public class PersonTest2 {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Tom"),
                new Korean("홍길동"),
                new Japanese("다나카"),
                new Chinese("왕밍")
        };

        for(Person a : persons)
        {
            greeting(a);
            System.out.println();
        }

    }

    private static void greeting(Person p){
        System.out.println(p);
        p.sayHello();
        p.sayBye();
    }


}
