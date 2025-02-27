class Example1 {
  static void fun1(){
    System.out.println("a");
}
}
public class Example {
    static void fun1(){
      System.out.println("B");
  }
  
public static void main(String[] args) {
    System.out.println("hii");
    fun1();
    Example1.fun1();
}
}