import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (b == 0){
            System.out.println("Impossible to divide by 0");
            System.exit(0);
        }
        int i,j, m;

        j=b;
        i=1;
        do {
           j=j+b;
           i=i+1;
        } while (a-j>b);
        m=a-j;
        if (m == b) {
            i++;
            m =0;
        }

        System.out.println(a + " div " + b + " = " + i);
        System.out.println(a + " mod " + b + " = " + m);
    }
}
