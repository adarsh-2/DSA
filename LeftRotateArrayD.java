public class LeftRotateArrayD{

    public static void main(String[] args) {
        
        int arr[] = {2,34,5,6,7,8,9,10};
        int d = 3;
        int temp[] = new int[d];
        for(int i = 0; i<d; i++){temp[i]=arr[i];}

        for(int j = d; j<arr.length; j++){
            arr[j-d] = arr[j];
        }

        for(int k = 0; k<d;k++){
            arr[arr.length - d + k] = temp[k]; 
        }

        for(int l = 0; l < arr.length; l++){
            System.out.print(arr[l] + " ");
        }
    }

}