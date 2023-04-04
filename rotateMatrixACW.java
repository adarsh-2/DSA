public class rotateMatrixACW {

    static void swap(int[][] matrix, int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    static void rotate(int[][] matrix){
        for(int i = 0; i<matrix.length; i++){
            for(int j = i + 1; j<matrix[0].length; j++){
                swap(matrix,i,j);
            }
        }

        for(int i = 0; i<matrix[0].length; i++){
            int low = 0;
            int high = matrix.length - 1;
            while(low<high){
                int temp = matrix[low][i];
                matrix[low][i] = matrix[high][i];
                matrix[high][i] = temp;
                low++;
                high--;
            }
        }
    }
    
    public static void main(String[] args) {
        
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        rotate(matrix);
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

}
