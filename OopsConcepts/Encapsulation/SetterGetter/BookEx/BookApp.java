package OopsConcepts.Encapsulation.SetterGetter.BookEx;

public class BookApp {
    public static void main(String[] args) {
        Book book = new Book();

        book.setPageNo(100);
        System.out.println(book.getPageNo());

    }
}
