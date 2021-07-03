package library;

import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books = new ArrayList<>();
    public ArrayList<User> users = new ArrayList<>();
    public ArrayList<Librarian> librarians = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book Added");
    }

    public void deleteBook(Book book){
        books.remove(book);
        System.out.println("Book Removed");
    }

    public void deleteBook(int bookId){
        boolean isRemoved = false;

        for(int i=0; i<books.size(); i++){
            if(books.get(i).getBookId() == bookId){
                books.remove(i);
                System.out.println("Book Removed");
                isRemoved = true;
                break;
            }
        }

        if(isRemoved == false){
            System.out.println("Book not found with Id : " + bookId);
        }
    }

    public void addUser(User user){
        users.add(user);
        System.out.println("User Added");
    }

    public void removeUser(int userId){
        boolean isRemoved = false;

        for(int i=0; i<users.size(); i++){
            if(users.get(i).getUserId() == userId){
                users.remove(i);
                System.out.println("User Removed");
                isRemoved = true;
                break;
            }
        }

        if(isRemoved == false){
            System.out.println("User not found with Id : " + userId);
        }
    }

    public void addLibrarian(Librarian librarian){
        librarians.add(librarian);
        System.out.println("Librarian Added");
    }

    public void removeLibrarian(int userId){
        boolean isRemoved = false;

        for(int i=0; i<librarians.size(); i++){
            if(librarians.get(i).getUserId() == userId){
                librarians.remove(i);
                System.out.println("Librarian Removed");
                isRemoved = true;
                break;
            }
        }

        if(isRemoved == false){
            System.out.println("Librarian not found with Id : " + userId);
        }
    }
}
