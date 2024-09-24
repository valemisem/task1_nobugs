package task2.uniqueBooks;

public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        book.setName("Title_1");
        book.setAuthor("Author_1");

        Book book1 = new Book("Title_2", "Author_2");
        Book book2 = new Book("Title_2", "Author_2");


        bookCollection books = new bookCollection();
        books.addBook(book);
        books.addBook(book1);
        books.addBook(book2);
        books.printBooks();

        System.out.print(books.ContainsBook(book));
        books.removeBook(book1);
        books.printBooks();
    }
}
