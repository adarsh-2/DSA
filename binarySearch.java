public class binarySearch {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int a = 7;
        int start = 0;
        int end = arr.length - 1;
        

        while(start<=end){

            int mid = (start + end)/2;
            
            
             if(a>arr[mid]){
                start = mid+1;
            }
            
            else if(a<arr[mid]){
                end = mid-1;
            }

            else{
                System.out.println(mid);
                break;
            }
            
            
        }
        

    }
    
}
