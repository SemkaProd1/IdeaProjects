import java.util.Scanner;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println();
        System.out.println(" Определить, проходит ли кирпич");
        System.out.println(" через прямоугольное отверстие");
        System.out.println("--------------------------------");

        System.out.print(" Введите размеры A и B отверстия: ");
        double a = in.nextDouble();
        double b = in.nextDouble();

        System.out.print(" Введите размеры X, Y, Z кирпича: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();

        boolean ok = (x <= a && y <= b) || (x <= b && y <= a) ||
                (x <= a && z <= b) || (x <= b && z <= a) ||
                (z <= a && y <= b) || (z <= b && y <= a);

        System.out.println("--------------------------------");
        System.out.printf(
                " Кирпич размером %.2f x %.2f x %.2f %sвходит в отверстие %.2f x %.2f\n",
                x, y, z, ok ? "" : "не ", a, b);
    }
}