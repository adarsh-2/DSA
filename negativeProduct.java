/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0){
		    int arr[] = new int[3];
		    arr[0]=sc.nextInt();
		    arr[1]=sc.nextInt();
		    arr[2]=sc.nextInt();
		    
		    int negCount = 0;
		    int posCount = 0;
		    
		    for(int i = 0;i<3;i++){
		        if(arr[i]>0)posCount++;
		        if(arr[i]<0)negCount++;
		    }
		    
		    if(negCount >= 1 && posCount >= 1){
		        System.out.println("YES");
		    }
		    else
		    System.out.println("NO");
		}
	}
}
