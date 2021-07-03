package library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Librarian jack = new Librarian(101, "Jack");

        User raihan = new User(100, "Raihan", "1665");
        User nazia = new User(101, "Nazia", "166565");

        Book book1 = new Book(9, "TOFEL", "Michael A.");
        Book book2 = new Book(10, "Guide to Java", "Herbelt Schildt");

        library.addLibrarian(jack);

        library.addBook(book1);
        library.addBook(book2);

        library.addUser(raihan);
        library.addUser(nazia);

        Book book3 = new Book(102, "Gang of Four", "Jani na");

        library.deleteBook(102);
        library.removeUser(100);


    }
}
