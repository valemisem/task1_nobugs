package org.example.task1.book;

public class Main {
    public static void main(String[] args) {
        book book1 = new book();
        book1.setTitle("Title of the book");
        book1.setAuthor("Author of the book");
        book1.setYear(1997);

//        book1.getTitle();
//        book1.getAuthor();
//        book1.getYear();

        book1.display();

    }
}
