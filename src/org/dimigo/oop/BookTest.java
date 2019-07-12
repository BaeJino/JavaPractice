package org.dimigo.oop;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("","",1);//int i = 10;
        //클래스 변수이름 객체 new 이름

        System.out.println(book1);  //값이 다름. 서로 다른 객체를 나타내고 있음.

        Book book3 = new Book("모순수업", "최인호",100);
        System.out.println(book3.getTitle());



    }
}
