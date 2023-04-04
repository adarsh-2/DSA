public class hcf {

    public static void main(String args[]) {
        int a = 153;
        int b = 81;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        for (int i = min; i > 1; i--) {
            if (max % i == 0 && min % i == 0) {

                System.out.print(i);
                break;

            } 
        }
    }

}