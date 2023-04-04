public class fibonacci2 {

    static int fib(int a) {

        int arr[] = new int[a];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < a; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[a - 1];
    }

    public static void main(String[] args) {

        System.out.println(fib(10));
        // 0 1 1 2 3 5 8 13 21 34

    }

}
