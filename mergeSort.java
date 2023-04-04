public class mergeSort
{
    static void mergeSortArray(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int mid = low + (high - low)/2;
            mergeSortArray(arr, low, mid);
            mergeSortArray(arr, mid + 1, high);
            merge(arr,low,mid,high);
        }
    }

    static void merge(int[] arr, int low, int mid, int high)
    {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] num1 = new int[n1];
        int[] num2 = new int[n2];

        for(int i = 0; i<n1; i++)
        num1[i] = arr[low + i];

        for(int i = 0; i<n2; i++)
        num2[i] = arr[mid + i +1];

        int i = 0;
        int j = 0;
        int k = low;
        while(i<n1 && j<n2)
        {
            if(num1[i]<num2[j])
            {
                arr[k] = num1[i];
                k++;
                i++;
            }
            else
            {
                arr[k] = num2[j];
                k++;
                j++;
            }
        }
        while(i<n1)
        arr[k++] = num1[i++];
        while(j<n2)
        arr[k++] = num2[j++];
    }

    public static void main(String[] args)
    {
        int[] arr = {9,8,7,6,5,4,3};
        int low = 0;
        int high = arr.length - 1;
        mergeSortArray(arr,low, high);
        for (int i = 0; i < arr.length; i++) 
        System.out.println(arr[i]);
    }
}