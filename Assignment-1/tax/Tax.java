import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter YourAnnual Income");
        int income = scanner.nextInt();

        if (income < 250000) {
            System.out.println("tax is not allowed on " + income);
        }
        else if(income < 500000){
            income = income*5/100;
            System.out.println("You have to paid tax : " + income);
        }
        else if (income < 1000000) {
            income = income * 20 / 100;
            System.out.println("You have to paid tax : " + income);
        }
        else if (income > 1000000) {
            income = income * 30 / 100;
            System.out.println("You have to paid tax : " + income);
        }
        scanner.close(); // Close the scanner to prevent resource leak
    }
}
