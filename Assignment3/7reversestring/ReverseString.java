import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string to reverse: ");
        String inputString = scanner.nextLine(); // Read the input string

        // Variable to store the reversed string
        String reversedString = "";

        // Loop through the string in reverse order
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString += inputString.charAt(i); // Append each character
        }

        // Display the reversed string
        System.out.println("Reversed String: " + reversedString);

        // Close the scanner
        scanner.close();
    }
}

//We can also use StringBuilder class
