import java.util.Scanner;

public class nthLastIndexOfElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Which element you want to find ");
        int find = sc.nextInt();

        System.out.println("Which last occurance you want to find ");
        int occ = sc.nextInt();

        int count = 0;

        for (int j = size - 1; j >= 0; j--) {
            if (arr[j] == find) {
                count++;
            }
            if (count == occ) {
                System.out.println(j);
            }
        }
        if (count == 0) {
            System.out.println(-1);
        }
    }

}
