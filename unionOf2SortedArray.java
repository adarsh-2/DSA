// PS : You are given 2 sorted arrays you have to return count of the element in the union of these 2 arrays.

import java.util.*;

public class unionOf2SortedArray {

    public static void main(String[] args) {

        int[] arr1 = { 1, 3, 3, 5, 7, 9, 9 };
        int[] arr2 = { 2, 2, 3, 3, 4, 7, 8 };

        HashSet<Integer> HM = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
                HM.add(arr1[i]);
        }
        
        for (int j = 0; j < arr2.length; j++) {
                HM.add(arr2[j]);
        }

        System.out.println(HM.size());

    }
}
