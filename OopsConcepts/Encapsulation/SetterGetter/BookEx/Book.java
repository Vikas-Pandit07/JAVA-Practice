package OopsConcepts.Encapsulation.SetterGetter.BookEx;

public class Book {
    private int pageNo;

//    Setters
    public void setPageNo(int pageNo) {
        if (pageNo > 0) {
            this.pageNo = pageNo;
        }
        else {
            System.out.println("Invalid page No");
        }
    }
// getter
    public int getPageNo() {
        return pageNo;
    }
}
