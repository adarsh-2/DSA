public class LeftRotateArray {

    public static void main(String[] args) {
        
        int arr[] = {4,6,7,1,11,100};
        int temp = arr[0];
        for(int i =1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1] = temp;

        for(int a = 0; a<arr.length; a++){
            System.out.print(arr[a] + " "); 
        }

    }
    
}
