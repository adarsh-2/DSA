/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class overspeedingFine {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int inp[] = new int[tc];
        for (int i = 0; i < tc; i++) {
            inp[i] = sc.nextInt();
        }

        // System.out.print("Adarsh");

        for(int j = 0; j<tc; j++){
        if(inp[j]<=70)
        System.out.println(0);
        else if(inp[j]>70 && inp[j]<=100)
        System.out.println(500);
        else
        System.out.println(2000);
        }

        // System.out.print("Adarsh");
    }
}
