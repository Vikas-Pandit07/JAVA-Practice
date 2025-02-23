package OopsConcepts.Constructor.ChainingEx;


class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        System.out.println("Creating Book: " + this.title + " " + this.author + " " + this.year);
    }

    public Book(String title, String author) {
        this(title, author, 2020);// chaining a custuctor with default year
    }

    public Book() {
        this("Unknown Title", "Unknown Author");
    }
}

public class BookExample {
    public static void main(String[] args) {
        Book book = new Book();
    }
}

