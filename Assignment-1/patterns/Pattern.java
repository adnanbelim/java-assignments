class Pattern {
    public static void main(String[] args) {

        int sequance = 1;
        for (int i = 1; i <= 5; i+=2) {
            for (int j = 0; j < i; j++)
            {
                System.out.print(sequance + " ");
                sequance++;
            }
            System.out.println();
        }
    }
}
