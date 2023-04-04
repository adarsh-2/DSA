public class passingArrayInFunction {

    static int[] pass(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(pass(arr));

    }

}
