public class Calculator1 {
    public static void main(String[] args) {
        System.out.println(mul(2));
        System.out.println(div(16));
        UTFConverter(90);
        System.out.println(greaterconverter(20, 40));
    }  
    
    public static int mul(int num) {
        int res = num << 1;
        return res;
    }
    public static int div(int num) {
        int res = num >> 1;
        return res;
    }
    public static void UTFConverter(int num) {
        char ch=(char)num; 
        System.out.println(ch);
        return; 
    }
    public static boolean greaterconverter(int a, int b){
        return a<b;
    }
}
