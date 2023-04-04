// You are given an array you have to convert that array into number add one to it and return the number in the array form

import java.util.*;

public class plusOne {

    static int[] po(int[] arr) {

        int n = arr.length;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans * 10 + arr[i];
        }

        long hope = ans + 1;

        String s = Long.toString(hope);
        int length = s.length();

        int arr2[] = new int[length];
        int k = length - 1;
        while (hope > 0) {
            arr2[k] = (int)(hope % 10);
            hope = hope / 10;
            k--;
        }

        return arr2;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] n = po(arr);
        System.out.println(Arrays.toString(n));
    }

}
