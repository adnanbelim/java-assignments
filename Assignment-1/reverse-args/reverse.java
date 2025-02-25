public class reverse {
    public static void main(String[] args){
        System.out.println("Arguments in reverse order:");
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
}
