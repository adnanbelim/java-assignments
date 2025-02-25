public class Payroll {
    public static void main(String[] args) {
        
        double hour, total; int days, workingHour;
        
        hour = Double.parseDouble(args[1]);
        days = Integer.parseInt(args[0]);
        workingHour = 8;

        if (hour >= 4.35) {
            if (days >= 7) {
                total = days * hour * workingHour;
                System.out.println("Total pay due of day (8 hour): $" + total);

            } else {
                System.out.println("Warning: The employee worked more than 7 days.");
            }
        } else {
            System.out.println("Warning: The pay rate is less than $4.35 per hour.");
        }
    }
}
