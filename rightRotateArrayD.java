
public cl\u0061ss rightRotateArrayD { // '\u0061' is unicode for 'a'

        public static void main(String[] args) {

                int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
                int d = 3;
                int l = arr.length;
                int temp[] = new int[d];

                for (int i = l - d; i < l; i++) {
                        temp[i - l + d] = arr[i];
                }

                for (int j = l - 1; j >= l - d - 1;j--) {
                        arr[j] = arr[j - d];
                }

                for(int k =0;k<d;k++) {
                        arr[k] = temp[k];
                }

                for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                }
        }

}
