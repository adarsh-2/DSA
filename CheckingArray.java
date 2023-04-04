import java.util.*;
import java.util.Scanner;
import java.util.concurrent.ForkJoinTask;

public class CheckingArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int arr[] = new int[a];

        for (int b = 0; b < a; b++) {
            arr[b] = sc.nextInt();
        }
        int flag =  1 ;

        // for (int c = 0; c < a - 1; c++) {
        //     if (arr[c] > arr[c + 1]) {
        //         System.out.println("Unsorted");
        //         break;
        //     }    
        // }
        // System.out.println("Sorted");
        
        for(int i = 0 ; i< a -1 ; i++){
            if(arr[i] > arr[i+1]){
                flag = 0 ; 
            }
        }
        if(flag == 0 ){
            System.out.println("unsorted");
        }else{
            System.out.println("sorted");
        }

    }

}