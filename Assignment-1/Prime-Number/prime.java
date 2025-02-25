public class prime {

    // Simple prime checking logic
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false; // 0 and 1 are not prime numbers
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, it's prime
    }
    public static void main(String[] args) {
        // Check if two arguments are provided
        int start, end, i;
        // Parse the input numbers
        start = Integer.parseInt(args[0]);
        end = Integer.parseInt(args[1]);

        // if (args.length != 2) {
        //     System.out.println("Please provide two numbers.");
        //     return;
        // }

        
        
        // try {
        //     start = Integer.parseInt(args[0]);
        //     end = Integer.parseInt(args[1]);
        // } catch (NumberFormatException e) {
        //     System.out.println("Please provide valid integer numbers.");
        //     return;
        // }

        // Ensure start is less than end
        // if (start > end) {
        //     System.out.println("The first number must be less than or equal to the second number.");
        //     return;
        // }

        // Print prime numbers in the range
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        // System.out.println();
    }
}
