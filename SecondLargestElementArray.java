import java.util.*;
import java.util.Scanner;

public class SecondLargestElementArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for (int b = 0; b < a; b++) {
            arr[b] = sc.nextInt();
        }

        int max = arr[0];
        int max2 = 0;

        for (int c = 1; c < a; c++) {
            if (arr[c] > max) {
                max2 = max;
                max = arr[c];
            } else if (arr[c] < max && arr[c] > max2) {
                max2 = arr[c];
            }
        }
        System.out.println(max2);
        System.out.println(max);

    }

}
