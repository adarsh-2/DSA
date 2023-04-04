// PS : Write a program to delete the pair in the linked list whose sum is equal to 0;
// 

import java.util.LinkedList;
import java.util.Scanner;

public class deleteElementSum0LinkedList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the linked List : ");
        int l = sc.nextInt();

        LinkedList<Integer> LL = new LinkedList<>();

        System.out.println("Enter elements :");
        for (int i = 0; i < l; i++) {
            LL.add(sc.nextInt());
        }

        for (int i = 0; i < LL.size() - 1; i++) {
            for (int j = 0; j < LL.size(); j++) {
                if (LL.get(i) + LL.get(j) == 0 && i != j) {
                    LL.remove(j);
                    LL.remove(i);
                }
            }
        }
        System.out.println(LL);
    }
}
