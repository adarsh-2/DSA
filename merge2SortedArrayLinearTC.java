import java.util.Arrays;

public class merge2SortedArrayLinearTC {

    static int[] mergeArr(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr3 = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                k++;
                i++;
            } else {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < arr1.length) {
            arr3[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            arr3[k] = arr2[j];
            k++;
            j++;
        }
        return arr3;

    }

    public static void main(String[] args) {

        int[] arr1 = { 1, 3, 5, 7, 9 };
        int[] arr2 = { 1, 4, 6, 8 };
        int[] arr3 = mergeArr(arr1, arr2);
        System.out.println(Arrays.toString(arr3));

    }

}
