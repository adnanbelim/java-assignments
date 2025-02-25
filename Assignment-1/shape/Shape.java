import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        double l, b, pi = 3.14, r, area;
        int choice; // Fixed spelling from 'choise' to 'choice'
        Scanner scanner = new Scanner(System.in); // Changed variable name for clarity

        System.out.println("Enter 1 to calculate the area of a rectangle");
        System.out.println("Enter 2 to calculate the area of a circle");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter length and breadth"); // Fixed spelling from 'breagth' to 'breadth'
                l = scanner.nextDouble();
                b = scanner.nextDouble();
                area = l * b;
                System.out.println("Area of rectangle is: " + area);
                break;
            case 2:
                System.out.println("Enter radius");
                r = scanner.nextDouble();
                area = pi * r * r;
                System.out.println("Area of circle is: " + area);
                break;
            default:
                System.err.println("Please enter a valid choice!!");
                break;
        }

        scanner.close(); // Close the scanner to prevent resource leak
    }
}
