import java.util.Scanner;

public class moveZeroesToEnd {

    static void swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i+1));
            arr[i] = sc.nextInt();
        }
        // 1 0 2 0 3 0 4

        for(int i = 0 ; i<n-1;i++){
            for (int j = 0; j < n-1; j++) {
                if(arr[j] == 0 && arr[j+1] != 0)
                swap(arr, j, j+1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
         
    }
    
}
