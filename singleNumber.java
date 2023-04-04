import java.util.*;

public class singleNumber {

    
        public static void main(String[] args) {


            int nums[] = {4,1,2,1,2};

            Arrays.sort(nums);
    
            int l = nums.length;
    
            if(nums[0]!=nums[1]);
            {System.out.println(nums[0]);}
    
            if(nums[l - 1] !=nums[l - 2])
            {System.out.println(nums[nums.length -1]);}
            
            int ans = 0;
            for(int i = 1; i<nums.length - 2;i =i+1){
                if(nums[i]!=nums[i-1] && nums[i]!=nums[i-1])
                ans = nums[i];
                break;
            }
    
            System.out.println(ans);
            
        }  

            
        
    }
    

