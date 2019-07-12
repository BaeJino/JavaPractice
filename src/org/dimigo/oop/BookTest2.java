package org.dimigo.oop;

public class BookTest2 {


    public static void main(String[] args) { //메인메소드 생성

        int num = 5;
        methodA(num);

        Book book = new Book("수학의바이블");
        methodB(book);
        System.out.println(book.getTitle());

        methodC(book);
        System.out.println(book.getTitle());

        Book book2 = new Book("배진호");
        System.out.println(book2.getTitle().length());
    }

    private static void methodC(Book book) {
        book.setTitle("이것이 자바다.");
    }

    private static void methodB(Book book) {
        book = new Book("이것이 자바다");
        System.out.println(book.getTitle());
    }


    private static void methodA(int num) {
        num += 10;
        System.out.println(num);
    }

}
