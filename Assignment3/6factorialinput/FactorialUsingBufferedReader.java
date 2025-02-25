import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FactorialUsingBufferedReader {
    public static void main(String[] args) throws IOException {
        // Create BufferedReader to take input from the user
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Prompt the user to enter a number
        System.out.print("Enter a number to calculate its factorial: ");
        int number = Integer.parseInt(reader.readLine()); // Read and convert the input

        // Calculate the factorial using a simple loop
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}

/*
 * Scanner: More convenient and simpler for reading input types like int,
 * String, etc.
 * BufferedReader: Requires more setup but can be more efficient for reading
 * larger inputs or lines of text.
 */
