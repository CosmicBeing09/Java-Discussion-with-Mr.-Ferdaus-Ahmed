package java_discussion_17;

import java_discussion_19.Test;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(101, "Title 1", "Author 1");
        Book book2 = new Book(102, "Title 2", "Author 2");
        Book book3 = new Book(101, "Title 3", "Author 3");


        library.addBooks(book1);
        library.addBooks(book2);
        library.addBooks(book3);

//        library.deleteBook(101);
//        library.deleteBook(201);
//        library.deleteBook(101);

//        library.getInfo(102);
//        library.getInfo(101);

        library.registerLibrarian(101, "Raihan");
        library.registerLibrarian(101, "Nazia");

//        library.isAvailable(101);
//        library.isAvailable(102);

//        book2.setStatus(false);

//        library.isAvailable(102);


        library.registerUser(101, "Nazia", "+880125");
        library.registerUser(101, "Munif", "+880126");

        library.issueBook(book1, 201, 101);
        library.issueBook(book1, 101, 101);
        library.issueBook(book1, 101, 101);

        library.returnBook(book1);
        library.isAvailable(book1.getBookId());
        library.issueBook(book1, 101, 101);


    }
}
