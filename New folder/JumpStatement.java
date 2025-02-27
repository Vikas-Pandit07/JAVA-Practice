public class JumpStatement {
    public static void main(String[] args) {
        for (int item = 1; item <= 10; item++) 
        {
            if (item == 6)
            {
                System.out.println("Item " + item + " found, stopping the search.");
                break;
            }
            System.out.println("Checking item " + item);
        }
    }
}
