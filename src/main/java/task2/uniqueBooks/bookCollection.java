package task2.uniqueBooks;

import java.util.HashSet;
import java.util.Set;

public class bookCollection  {
    private final Set<Book> bookSet = new HashSet<>();

    public void addBook(Book newBook){
        this.bookSet.add(newBook);
    }

    public void removeBook (Book newBook){
        this.bookSet.remove(newBook);
    }

    public boolean ContainsBook (Book newBook) {
        for (Book book : bookSet) {
            if (book.equals(newBook)) {
                return true;
            }
        }
        return false;
    }
    public void printBooks() {
        for (Book book : bookSet) {
            System.out.print("Books:\n" + book.getName());
        }
    }

}