import java.util.Scanner;

public class ballProbability {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of red balls : ");
        int red = sc.nextInt();
        System.out.print("Enter no of black balls : ");
        int black = sc.nextInt();
        int total = red + black;
        System.out.println("1. Red");
        System.out.println("2. Black");
        System.out.print("Whose probability you want to find : ");
        int ballCase = sc.nextInt();
        switch (ballCase) {
            case 1:
                System.out.println("Probability of red ball : " + red + "/" + total);
                break;
            case 2:
                System.out.println("Probability of black ball : " + black + "/" + total);
                break;
        }

    }

}
