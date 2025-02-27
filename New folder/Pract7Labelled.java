public class Pract7Labelled {
    
    public static void main(String[] args) {
        //outer:
         for (int i = 1; i <= 3; i++) 
        {
         inner:   for (int j = 1; j <= 5; j++) 
            {
                System.out.println("Kodnest");
                if(i==2)
                    //break outer;
                    break inner;
            }
            System.out.println("Technology");
        }
    }
}