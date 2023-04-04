public class fibonacci {

    static int fib(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 11; i++) {
            System.out.print(fib(i) + " ");
        }
    }

}

// 1 1 2 3 5 8 13 21 34 55 89