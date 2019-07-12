package org.dimigo.Inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("잔나비",27,180,70);
        System.out.println(p1);
        p1.sleep();
        p1.eat();


        Student s1 = new Student("마재연",18,170,65,"2609");
        System.out.println(s1);
        s1.eatSnack();
        s1.study();

        Teacher t1 = new Teacher("김종수",48,180,60,"화학I");
        System.out.println(t1);
        t1.eat();
        t1.sleep();
        t1.doTask();
        t1.teach();


    }
}