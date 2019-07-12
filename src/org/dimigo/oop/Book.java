package org.dimigo.oop;

public class Book {
    //필드 세개
    private String title;
    private String author;
    private int page;

    //기본생성자 public void Book() 는 메소드이다. 생성자는 public 으로 열어둔다.


    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public Book(String title , String author){
        this(title,author,100);

    }
    public Book(String title){
        this(title , "저자미상");

    }






    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    //객체가 가지고 있는 데이터를 String으로 변환해주는 것을 toString 이라고 함

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                '}';
    }
}
