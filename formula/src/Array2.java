import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        int n, arr[];
        Scanner in = new Scanner(System.in);
        System.out.print("Array size: ");
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * n);

            //with negative numbers
            //arr[i] = (int) (Math.random() * n) - n / 2;
    }
        for (int i: arr){
            System.out.print( + i + "  ");
        }
        System.out.println();

        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));

        int[] Elements = { arr[0], arr[1], arr[2] };
        for (int i: Elements){
            System.out.print( + i + "  ");
        }
    }
}

