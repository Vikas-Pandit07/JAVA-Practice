public class Pract8Labelled {
    
    public static void main(String[] args) {
        outer: for (int i = 1; i <= 3; i++) 
        {
        // inner:   
        for (int j = 1; j <= 5; j++) 
            {
                System.out.println("Kodnest");
            }
            System.out.println("Technology");
            if(i==2)
             break outer;
        }
    }
}