public class pract16 {
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        int k=0;
       outermost: while(k<=5)
        {
       outer: for (int i = 1; i <= 5; i++)
        {
            System.out.println("Kodnest");
           for (int j = 1; j<=3; j++){
           if (k == 4)
            {
                continue outer; 
            }
            else{
                System.out.println("Technologies");
                break outermost;
            }
        }
        System.out.println("PVT LTD");
        }
        System.out.println("---------------------------------------------------------------");
        k++;
    }
    }

}

