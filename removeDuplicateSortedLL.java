// PS : Remove duplicate elements from a sorted LinkedList.

import java.util.LinkedList;
import java.util.Scanner;


public class removeDuplicateSortedLL {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the LinkedList : ");
        int n = sc.nextInt();
        LinkedList<Integer> LL = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            LL.add(sc.nextInt());
        }

        for (int i = 0; i < LL.size()-1; i++) {
            for (int j = 0; j < LL.size()-1; j++) {
                if(LL.get(j)==LL.get(j+1)){
                    LL.remove(j+1);
                }
            }
        }

        System.out.println(LL);

    }

}
