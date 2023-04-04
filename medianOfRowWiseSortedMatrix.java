import java.util.Arrays;

public class medianOfRowWiseSortedMatrix {

    static int helper(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        int max = matrix[0][0];
        int min = matrix[0][c-1];

        for(int i = 0; i<r; i++){
            if(matrix[i][0]<min)
            min = matrix[i][0];

            if(matrix[i][c-1]>max)
            max = matrix[i][c-1];
        }

        int medPos = (r*c + 1)/2;

        while(min<max){
            int mid = (min + max)/2;

            int midPos = 0;

            for(int i = 0; i<r; i++){
                int pos = Arrays.binarySearch(matrix[i], mid) + 1;
                midPos += Math.abs(pos);
            }

            if(midPos<medPos)
            min = mid + 1;
            else
            max = mid;
        }
        return min;
    }
    
    public static void main(String[] args) {
        
        int[][] matrix = {
            {5,10,20,30,40},
            {1,2,3,4,6},
            {11,13,15,17,19}
        };
        int ans = helper(matrix);
        System.out.println(ans);
    }

}
