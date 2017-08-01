import java.util.Scanner;

/**
 * Created by SemkaProd on 13.07.2017.
 */
public class Calc {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want calculated sum[1]/difference[2] division[3] multiplication[4]?");
        int input = in.nextInt();
        if (input == 1) {
            System.out.println("Enter numbers two for SUM");
            a = in.nextInt();
            b = in.nextInt();
            int c = a + b;
            System.out.println(c);
        }
        if (input == 2) {
            System.out.println("Enter numbers two for DIFFERENCE");
            a = in.nextInt();
            b = in.nextInt();
            int c = a - b;
            System.out.println(c);
        } if (input == 3) {
            System.out.println("Enter numbers two for DIVISION");
            a = in.nextInt();
            b = in.nextInt();
            int c = a / b;
            System.out.println(c);
        } if (input == 4) {
            System.out.println("Enter numbers two for MULTIPLICATION");
            a = in.nextInt();
            b = in.nextInt();
            int c = a * b;
            System.out.println(c);
        }
        else {
            System.out.println("Enter the 1, 2, 3, or 4, please");
        }

    }
}
