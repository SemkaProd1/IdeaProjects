import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collection {
    public static void main(String args[]) {

        Integer[] numbers = new Integer[29];
        for (int i = 0; i < 29; i++)
            numbers[i] = (int) Math.round((Math.random() * 30) - 15);
        System.out.println(Arrays.toString(numbers));
        int sum = 7;
        List<Integer> Numbers = Arrays.asList(numbers);
        Collections.sort(Numbers);
        System.out.println(Arrays.toString(numbers));
        for ( int i : Numbers) {
            if (Numbers.contains(sum - i) && i <= (sum / 2) && i != (sum - i)) {
                System.out.print((sum - i) + " & ");
                System.out.println(+i);
            }
        }
    }
}