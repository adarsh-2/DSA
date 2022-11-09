import java.*;
import java.util.Scanner;

public class MaxofArray {
        public static void main(String[] args) {


            //This is used when array is predifined

            int[] arr = {4,5,1,7,9,10,6,7,11};
            int max = arr[0];
            for(int i = 0; i < arr.length; i++){
                if(arr[i]>max)
                max=arr[i];
            }

            System.out.println(max);



            //This code is used when array size and array is provided by the user

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int abc[] = new int[n] ; 
            for(int i = 0; i < n; i++){
                abc[i] = sc.nextInt();
            }

            int maxi = abc[0];

            for(int j = 0; j < abc.length; j++){
                if(abc[j]>maxi)
                maxi = abc[j];
            }
            System.out.print("Max element " + maxi);
        }    
}