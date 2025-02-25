import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Year in 4 digit to chack year is leap or not");
        int year = scanner.nextInt();

        if(year/1000 == 0){
            System.err.println("please Enter Year like YYYY");
        }
        else{
            if(year % 4 == 0){
                System.out.println(year + " Year is leap.");
            }
            else{
                System.out.println(year + " Year is not leap.");
            }
        }
        scanner.close(); // Close the scanner to prevent resource leak
    }
}
