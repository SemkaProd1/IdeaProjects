
import java.time.LocalDate;

public class LocalDate1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 7, 17);

        // Output must be 17 July 2017
        System.out.println(String.format("%td %tB %tY ", date, date, date));
    }
}