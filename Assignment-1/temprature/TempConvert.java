import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args){
        double fr, cell;                                            // Create Variable
        Scanner scanner = new Scanner(System.in);                   // use Scanner as scanner variable
        System.out.println("Enter temprature in celsius : ");     // for output
        cell = scanner.nextDouble();                                // to take input as double
        fr = (9/5*cell) + 32;                                       // Logic
        System.out.println("Fehrenheit temprature is : " + fr);     // Output
        scanner.close();                                            // close scanner class
    }
}
