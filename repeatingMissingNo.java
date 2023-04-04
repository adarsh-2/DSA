import java.util.*;

public class repeatingMissingNo {
    
    static int[] torrent(int[] arr){
        Arrays.sort(arr); // 1 1 2 3 4
        int repeat = -1;
        int miss = -1;
        int[] ans = new int[2];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1])
            repeat = arr[i];
            ans[0] = repeat;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int sSum = 0;
        for(int i = 1; i<= arr.length; i++){
            sSum += i;
        }
        miss = sSum - (sum - repeat);
        ans[1] = miss;
        return ans;
    }

    public static void main(String[] args) {
        
        int[] arr = {7,1,2,2,4,5,3};
        int[] ans = torrent(arr);
        System.out.print(Arrays.toString(ans));
    }

}
