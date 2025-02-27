import java.util.LinkedList;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<Integer>();
        l1.add(100);
        l1.add(50);
        l1.add(70);
        l1.add(120);
        l1.add(180);
        System.out.println(l1.remove());
        System.out.println(l1.remove());
        System.out.println(l1.remove());
        System.out.println(l1.remove());
        System.out.println(l1);
    }
}
