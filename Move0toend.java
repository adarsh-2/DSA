public class Move0toend {

    public static void main(String[] args) {

        int arr[] = { 1, 0, 2, 3, 0, 9, 0, 7 };

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == 0 && arr[i + 1] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}