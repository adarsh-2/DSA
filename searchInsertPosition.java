// PS : You are given a non decreasing integer array and a target value.
// You have to find out the index where target value should be inserted so that the new array is also non decreasing.

public class searchInsertPosition {

    static int position(int[] arr, int target){
        // 1 3 5 6 
        // Target = 2
        int start = 0;
        int end = arr.length - 1;
        int index = 0;
        while(start<end){
            int mid = (start + end)/2;
            if(arr[mid]>target && arr[mid+1]>target){
                end = mid -1;
            }

            if(arr[mid]<target && arr[mid+1]<target){
                start = mid + 1;
            }
            else{
                index = mid;
                
            }

        }
        return index;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,3,5,6};
        int target = 4;
        int ind = position(arr,target);
        System.out.println(ind);

    }

}
