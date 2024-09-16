package org.example.task1.bank;
// объект = экземпляр
// созданный класс - мой новый тип данных, передаю сюда

public class Main {
    public static void main(String[] args) {
        bank account1 = new bank();
        account1.setBalance(10000);

//        int balance1 = account1.getBalance();
//        System.out.println(balance1);

        account1.print();
    }
}

