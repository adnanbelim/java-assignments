class Combo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if(arr[i] != arr[j] && arr[j] != arr[k] && arr[k] != arr[i]){
                        System.out.println(arr[i] + " , " + arr[j] + " , " + arr[k]);
                    }
                }
            }
        }
    }
}