import java.util.Scanner;

public class subarrayOf3WithMaxProd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the size of the subarry : ");
        int k = sc.nextInt();

        int max = 1;
        for (int i = 0; i < k; i++) {
            max = max * arr[i];
        }

        int[] maxArr = new int[k];

        for (int i = 1; i < n - k + 1; i++) {
            int cp = max / arr[i - 1];
            cp = cp * arr[i + k - 1];
            if (cp > max) {
                max = cp;

                for (int j = 0; j < k; j++) {
                    maxArr[j] = arr[j + i];
                }
            }
        }

        for (int i = 0; i < maxArr.length; i++) {
            System.out.print(maxArr[i] + " ");
        }

    }

}
