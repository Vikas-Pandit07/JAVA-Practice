package com.kodnest.oops.HasARelationship;

class Book {
    String title;
    String author;
    void displayBookDetails() {
        System.out.println("Book:  " + title);
        System.out.println("Author:  " + author);
    }
}

class Library {
    Book libraryBook;
    void addBook(Book newBook) {
        libraryBook = newBook;

    }
    void showBook() {
        libraryBook.displayBookDetails();
    }
}
public class Aggregation {
    public static void main(String[] args) {
        Book myFavoriteBook = new Book();
        myFavoriteBook.title = "1984";
        myFavoriteBook.author = "George Orwell";

        Library cityLibrary = new Library();
        cityLibrary.addBook(myFavoriteBook);

        cityLibrary.showBook();
    }
}
