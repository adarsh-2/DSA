// PS : You are given a matrix you have to print the contents of the matrix in snake pattern

public class matrixInSnakePattern 
{
    static void fun(int[][] arr)
    {
        int rows = arr.length;

        int i = 0;

        while(i<rows)
        {
            for(int j = 0; j<arr[i].length; j++)
            System.out.print(arr[i][j] + " ");

            i++;
            
            if(i==rows)
            break;

            for(int j = arr[i].length - 1; j>-1; j--)
            System.out.print(arr[i][j] + " ");

            i++;
        }
    }

    public static void main(String[] args) 
    {
        int[][] arr = 
        {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        fun(arr);
    }    
}