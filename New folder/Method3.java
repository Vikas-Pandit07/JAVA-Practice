//not accept parameter but return value
public class Method3 {
    public static void main(String[] args) {
        int res=add();
        System.out.println(res);
    }
    public static int add(){
        int a = 10;
        int b = 20;
        return a+b;
    }
}
