package java_discussion_17;

import java.util.ArrayList;

public class Library {
    private Book[] books = new Book[100];
    private int currentBookIndex = 0; //2 -> 0th 1st

    private Librarian[] librarians = new Librarian[5];
    private int currentIndexAvailableForLibrarian = 0; //2nd -> 0 1

    private User[] users = new User[100];
    private int currentAvailableIndexForUser = 0;


//    public void addBooks(Book book){
//        boolean isMatched = false;
//
//        //checking if there is any collision
//        for(int i=0; i < currentBookIndex; i++){
//            if(books[i] != null){
//                if(books[i].getBookId() == book.getBookId()){
//                    isMatched = true;
//                }
//            }
//        }
//
//        //adding books
//        if(!isMatched){
//            books[currentBookIndex] = book;
//            currentBookIndex++;
//            System.out.println("Book added is Id : " + book.getBookId());
//            System.out.println("===========================================");
//            System.out.println();
//        }
//        else {
//            System.out.println("Book Id : " + book.getBookId() + " already exist");
//            System.out.println("===========================================");
//            System.out.println();
//        }
//
//    }

    public void addBooks(Book book) {
        boolean isMatched = false;

        //checking if there is any collision
        for (int i = 0; i < currentBookIndex; i++) {
            if (books[i] != null) {
                if (books[i].getBookId() == book.getBookId()) {
                    isMatched = true;
                    System.out.println("Book Id : " + book.getBookId() + " already exist");
                    System.out.println("===========================================");
                    System.out.println();
                    break;
                }
            }
        }

        //adding books

        if (!isMatched) {
            books[currentBookIndex] = book;
            currentBookIndex++;
            System.out.println("Book added is Id : " + book.getBookId());
            System.out.println("===========================================");
            System.out.println();
        }

    }


    public void deleteBook(int id) {
        boolean isFound = false;

        for (int i = 0; i <= currentBookIndex; i++) { // 1/0
            if (books[i] != null) {
                if (books[i].getBookId() == id) {
                    isFound = true;
                    System.out.println("Book Deleted with Id : " + books[i].getBookId());
                    System.out.println("Title : " + books[i].getTitle());
                    System.out.println("Author : " + books[i].getAuthor());

                    books[i] = null; //deleted

                    System.out.println("===========================================");
                    System.out.println();
                }
            }
        }

        if (!isFound) {
            System.out.println("Book not found");
            System.out.println("===========================================");
            System.out.println();
        }
    }

    public void getInfo(int id) {
        boolean isFound = false;

        for (int i = 0; i <= currentBookIndex; i++) {
            if (books[i] != null) {
                if (books[i].getBookId() == id) {
                    isFound = true;
                    System.out.println("Book Id: " + books[i].getBookId());
                    System.out.println("Title : " + books[i].getTitle());
                    System.out.println("Author : " + books[i].getAuthor());
                    System.out.println("Status : " + books[i].getStatus());
                    System.out.println("===========================================");
                    System.out.println();
                }
            }
        }

        if (!isFound) {
            System.out.println("Book not found with id : " + id);
            System.out.println("===========================================");
            System.out.println();
        }
    }

    public void registerLibrarian(int id, String name) {
        boolean isMatched = false;

        //checking if librarian with similar Id already exist
        for (int i = 0; i < currentIndexAvailableForLibrarian; i++) {
            if (librarians[i].getId() == id) {
                isMatched = true;
            }
        }

        if (isMatched) {
            System.out.println("Librarian with Id " + id + " already exist");
            System.out.println("===========================================");
            System.out.println();
        } else {
            Librarian librarian = new Librarian(id, name);
            librarians[currentIndexAvailableForLibrarian] = librarian;
            currentIndexAvailableForLibrarian++;
            System.out.println("Librarian added with Id : " + id + " Name: " + name);
            System.out.println("===========================================");
            System.out.println();
        }
    }

    public void isAvailable(int bookId) {
        // book is not available
        // book available
        // Doesn't exist any book with that Id

        boolean isFound = false;
        Book tempBook = null;

        // ======== Finding Book ===============
        for (int i = 0; i < currentBookIndex; i++) {
            if (books[i] != null) {
                if (books[i].getBookId() == bookId) {
                    isFound = true;
                    tempBook = books[i];
                }
            }
        }
        // ========= Loop Ends Here ==============

        if (!isFound) {
            System.out.println("Book Doesn't Exist with Id : " + bookId);
        } else {
            if (tempBook.getStatus()) System.out.println("Book is available");
            else System.out.println("Book On Loan");
        }
    }

    public void registerUser(int userId, String name, String phoneNo) {

        boolean isMatched = false;

        for (int i = 0; i < currentAvailableIndexForUser; i++) {
            if (users[i].getUserId() == userId) {
                System.out.println();
                System.out.println("User with userId : " + userId + " already exist");
                System.out.println("=======================================");
                isMatched = true;
                break;
            }
        }

        if (isMatched == false) {
            User user = new User(userId, name, phoneNo);
            users[currentAvailableIndexForUser] = user;
            currentAvailableIndexForUser++;

            System.out.println();
            System.out.println("User Added");
            System.out.println("=========================");
        }

    }

    public void issueBook(Book book, int userId, int issuerId){
        if(!book.getStatus()){
            System.out.println("Book is not available");
            System.out.println("Book is taken by : " + book.getUserId());

            for(int i=0; i<currentAvailableIndexForUser; i++){
                if(users[i].getUserId() == book.getUserId()){
                    System.out.println("Name : " + users[i].getName());
                    System.out.println("Phone No: " + users[i].getPhoneNum());
                    break;
                }
            }
           lineSpearator();
        }
        else {
            boolean isUserFound = false;

            for(int i=0; i<currentAvailableIndexForUser; i++){
                if(users[i].getUserId() == userId){
                    isUserFound = true;
                }
            }

            if(isUserFound){
                book.setStatus(false);
                book.setUserId(userId);
                book.setIssuerId(issuerId);
                System.out.println("Book issued successfully");
                lineSpearator();
            }
            else {
                System.out.println("User not found with id : " + userId);
                lineSpearator();
            }
        }
    }

    public void returnBook(Book book){
        book.setStatus(true);
        book.setUserId(-1);
        book.setIssuerId(-1);
        System.out.println("Book returned to the store");
        lineSpearator();
    }

    private void lineSpearator(){
        System.out.println();
        System.out.println("=================================");
    }

}
