import java.util.Stack;
public class StackO {
    public static void main(String[] args) {

        Stack<Integer> s1=new Stack<Integer>();
        s1.push(100);
        s1.push(200);
        s1.push(300);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }
}
