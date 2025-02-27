public class PyramidPattern {
    public static void main(String[] args) {
        

        // Upper part of the pyramid (normal pyramid)
        for (int i = 1; i <= 5; i++) {
            // Print leading spaces
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }

        // Lower part of the pyramid (inverted pyramid)
        for (int i = 4; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
