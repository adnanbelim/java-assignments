public class Payroll {
    public static void main(String[] args) {

        // Parsing the command-line arguments
        double payRate, totalPay, hoursWorked;

        // Assuming args[0] is hours worked, and args[1] is the pay rate
        hoursWorked = Double.parseDouble(args[0]); // Hours worked
        payRate = Double.parseDouble(args[1]); // Pay rate

        // Check if the pay rate is above the minimum wage
        if (payRate < 4.35) {
            System.out.println("Warning: The pay rate is less than $4.35 per hour.");
        }

        // Check if the employee worked more than 40 hours (considering a standard
        // workweek)
        if (hoursWorked > 40) {
            System.out.println("Warning: The employee worked more than 40 hours.");
        }

        // Calculate total pay
        totalPay = hoursWorked * payRate;

        // Output total pay
        System.out.println("Total pay due: $" + totalPay);
    }
}
