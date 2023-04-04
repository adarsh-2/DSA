// Jagged array is the array whose elements are arrays and possibly of different size

public class jaggedArray
{
    public static void main(String[] args)
    {
        int arr[][] = new int[3][];

        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = new int[i+1];

            for(int j = 0; j<arr[i].length; j++)
            {
                arr[i][j] = i;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
