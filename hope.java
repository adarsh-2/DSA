class Solution {
    static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
       
        String ans = "";
        int i = 0;
        int j = 0;
        while(i<strs[0].length() && j<strs[1].length()){
            if(strs[0].charAt(i) == strs[1].charAt(j)){
                ans = ans + strs[0].charAt(i);
                i++;
                j++;
            }
            else{
                break;
            }
        }
        if(strs.length>2){
        // String ans3 = "";

       
        for(int k = 2; k<strs.length; k++)
        {
        String ans2 = "";
        int l = 0;
        int m = 0;
        while(l<ans.length() && m<strs[k].length())
        {
            if(ans.charAt(l) == strs[k].charAt(m))
            {
                ans2 = ans2 + strs[k].charAt(m);
                m++;
                l++;
            }
            else
            {
                break;
            }
                ans = ans2;
        }
        }
        return ans;
        }
         else{
             return ans;
         }
    }

    public static void main(String[] args) {
        
        String arr[] = {"baab","bacb","b","cbc"};
        String ans = longestCommonPrefix(arr);
        System.out.print(ans);

    }

}