public class matrixBoundaryTraversal {

    static void helper(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;

        if(rows == 1){
            for(int i = 0; i<columns; i++)
            System.out.println(matrix[rows-1][i]);

            
        }
        else if(columns == 1){
            for(int i = 0; i<rows; i++)
            System.out.println(matrix[i][columns - 1]);
        }
        else{
            for(int i = 0; i<columns; i++)
            System.out.println(matrix[0][i]);

            for(int i = 1; i<rows; i++)
            System.out.println(matrix[i][columns - 1]);

            for(int i = columns - 2; i>-1; i--)
            System.out.println(matrix[rows-1][i]);

            for(int i = rows - 2; i>0; i--)
            System.out.println(matrix[i][0]);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        helper(matrix);
    }
}
