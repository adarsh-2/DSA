public class twoDimensionalArray {

    public static void main(String[] args) {
        
        int[][] arr = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        int k = 60;
        int r = arr.length; // this give the number of rows;

        int c = arr[0].length; // this give the number of columns;
        
        for(int i = 0; i< r; i++) {
            for(int j= 0;j<c;j++) {
                if(arr[i][j]==k){
                    System.out.print(i + " " + j + " "); // print the index in the form of row and column
                }



    }
    
}}}
