import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
            }
            sum += arr[i][i];
        }
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println(sum);

        scanner.close();
    }
}
