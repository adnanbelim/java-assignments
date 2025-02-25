public class NumberPattern {
    public static void main(String[] args) {
        int rows = 4; // Number of rows for the pattern

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line
            System.out.println();
        }
    }
}