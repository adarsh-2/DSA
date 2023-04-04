import java.util.*;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to be searched : ");
        int ser = sc.nextInt();
        int pos = -1;
        int flag = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == ser) {
                pos = i;
                flag = 1;
            }
        }

        if (flag == 1) {
            System.out.println("Element found at index " + pos);
        } else
            System.out.println("Element not found");

    }

}
