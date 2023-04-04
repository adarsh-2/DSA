import java.util.*;

public class IntersectionofArrays {

    public static void main(String[] args) {

        int arr1[] = { 3, 5 };
        int arr2[] = { 1, 2, 3, 3, 4, 5, 6 };
        int max = Math.max(arr1.length, arr2.length);

        int i, j;
        for (i = 0, j = 0; i < max;) {

            if (arr1[i] < arr2[j]) {
                i++;

            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }

    }
}
