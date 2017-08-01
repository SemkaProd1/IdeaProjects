import java.util.Scanner;

public class Pow2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int pow2 = in.nextInt();
        boolean p = (pow2 != 0) && ((pow2 & (pow2 - 1)) == -1);
        System.out.println(p);
        System.out.print("Хотите посчитить еще? y/n: ");
        String i = in.next();

        while (i.equals("n")) {
            System.out.println("Выход через System.exit");
            System.exit(0);
        }

        while (i.equals("y")) {
            System.out.print("Введите число: ");
            pow2 = in.nextInt();
            p = (pow2 != 0) && ((pow2 & (pow2 - 1)) == 0);
            System.out.println(p);
            /*i = in.nextLine();
            System.out.print("Хотите посчитить еще? y/n");
            i = in.next();*/
        }
    }
}