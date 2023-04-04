import java.util.Arrays;

public class sortingCharacter {

    static void swap(int[] arr ,int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int[] selectionSort(int arr[]) {

        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr,min, i);
        }
        return arr;
    }

    

    public static void main(String[] args) {

        char arr[] = { 'c', 'a', 'b', 'd', 'b' };

        int arr2[] = new int[arr.length];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
        }

        selectionSort(arr2);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print((char) arr2[i] + " ");
        }

    }

}
