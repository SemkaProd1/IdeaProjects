/*import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int n, arr[];
        Scanner in = new Scanner(System.in);
        System.out.print("Array size: ");
        n = in.nextInt();
        arr = new int[n];
        int i,j;
        for ( i=0;i<arr.length;i++)
            arr[i] = (int) ( Math.random() * n);
        for (i: arr)
            System.out.print( i + " " );

        for (i = arr.length - 1; i >= 0; i--) {
            for (j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (i : arr){
            System.out.print(i + " ");
        }

    }
}*/