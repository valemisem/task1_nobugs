package org.example.task1.bank;

// ОПИСАНИЕ КЛАССА - это шаблон для создания объекта
// точка входа у нас одна - класс MAIN

public class bank implements Printable { // имя совпадает с именем класса, который мы создали
    private String accountNumber;
    private int balance;

    // сеттеры - положи в поле
    public void setBalance(int balance) {
        this.balance = balance;
    }

    // геттеры - забери из поля
    public int getBalance() {
        return this.balance;
    }

    @Override
    public void print() {
        System.out.println(this.balance);

    }
}




