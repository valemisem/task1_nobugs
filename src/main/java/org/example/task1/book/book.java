package org.example.task1.book;
/*
   создать класс Book с полями для хранения названия, автора, года.
   методы get, set
   создать интерфейс Displayable
*/

public class book implements Displayable {
    private String title;
    private String author;
    private int year;

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return this.author;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }

    @Override
    public void display() {
        System.out.println("Here we have " + this.title + "\n" + "Here we have " + this.author + "\n" + "Here we have " + this.year);
    }
}
