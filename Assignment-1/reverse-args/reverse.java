public class reverse {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide minimum two argument");
        } else {
            System.out.println("Arguments in reverse order:");
            for (int i = args.length - 1; i >= 0; i--) {
                System.out.println(args[i]);
            }
        }
    }
}