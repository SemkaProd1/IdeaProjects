import java.util.Scanner;
import java.lang.Math;

public class Brick {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Diam = ");
        double diam = in.nextDouble();

        System.out.print("X= ");
        double x = in.nextDouble();
        System.out.print("Y= ");
        double y = in.nextDouble();
        System.out.print("Z= ");
        double z = in.nextDouble();
        double diam1 = Math.sqrt( Math.pow(x, 2) + Math.pow(y,2));
        double diam2 = Math.sqrt( Math.pow(x, 2) + Math.pow(z,2));
        double diam3 = Math.sqrt( Math.pow(z, 2) + Math.pow(y,2));

        boolean ok = (diam1 <= diam ) || (diam2 <= diam ) ||(diam3 <= diam );

        System.out.println(ok);

    }
}