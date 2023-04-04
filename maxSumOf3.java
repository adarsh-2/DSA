public class maxSumOf3
{
    public static void main(String[] args)
    {
        int[] arr = {2,5,0,-10,14,1};
        int sum = arr[0] + arr[1] + arr[2];
        int currSum = arr[0] + arr[1] + arr[2];
        for(int i = 1; i<arr.length - 2; i++)
        {
            currSum = currSum - arr[i-1];
            currSum = currSum + arr[i+2];
            if(currSum>sum)
            {
                sum = currSum;
            }
        }
        System.out.println(sum);
    }    
}
