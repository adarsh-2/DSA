// PS : You are given a non decreasing integer array.
// You have to find the first and last index of the target value.

public class firstLastIndex {

    static int firstIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int index = 0;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                index = mid;
            }
        }
        return index;
        
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,7,8};
        int target = 5;
        int index = firstIndex(arr, target);
        System.out.println(index);
    }

}
