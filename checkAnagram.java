// PS : Two strings are given check if they are anagram or not

// TC : O(l1+l2)
// SC : O(l1+l2)

public class checkAnagram
{
    public static void main(String[] args)
    {
        String s1 = "geeks";
        String s2 = "keeggs";

        int l1 = s1.length();
        int l2 = s2.length();
        boolean flag = true;
        int[] arr1 = new int[128];
        int[] arr2 = new int[128];

        for(int i = 0; i<l1 ; i++)
        {
            arr1[s1.charAt(i)]++;
        }

        for (int i = 0; i < l2; i++)
        {
            arr2[s2.charAt(i)]++;
        }

        for(int i = 0; i<128; i++){
            if(arr1[i]!=arr2[i])
            flag = false;
        }

        System.out.println(flag);

    }
}
