import java.util.*;

public class UnionofArray {

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> al = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (al.isEmpty() == false && al.get(al.size() - 1) == arr1[i]) {
                    i++;
                } else {
                    al.add(arr1[i]);
                    i++;
                }
            }
            else if (arr1[i] > arr2[j]) {
                if (al.isEmpty() == false && al.get(al.size() - 1) == arr2[j]) {
                    j++;
                } else {
                    al.add(arr2[j]);
                    j++;
                }
            }
            else {
                if (al.isEmpty() == false && al.get(al.size() - 1) == arr1[i]) {
                    i++;
                    j++;
                } else {
                    al.add(arr1[i]);
                    i++;
                    j++;
                }
            }
        }
        while (j < m) {
            if (al.isEmpty() == false && al.get(al.size() - 1) == arr2[j]) {
                j++;
            }
            else{
                al.add(arr2[j]);
                j++;
            }
        }
        while (i < n) {
            if (al.isEmpty() == false && al.get(al.size() - 1) == arr1[i]) {
                al.add(arr1[i]);
                i++;
            }
            else{
                al.add(arr1[i]);
                i++;
            }
        }

        return (al);

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2 };
        int arr2[] = { 1, 3, 4 };
        ArrayList<Integer> al = findUnion(arr1, arr2, 3, 3);
        System.out.println(al);

    }

}
