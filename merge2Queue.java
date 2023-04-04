import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class merge2Queue {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        int a = sc.nextInt();
        
        for(int i = 0;i<a;i++){
            q1.add(sc.nextInt());
        }
        
        int b = sc.nextInt();
        
        for(int i = 0;i<b;i++){
            q2.add(sc.nextInt());
        }
        
        for(int i = 0;i<b;i++){
            q1.add(q2.poll());
        }
        
        System.out.println(q1);
        
    }
    
}
