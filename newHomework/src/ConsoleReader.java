import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader implements Reader {
    BufferedReader is = null;
    String input = null;
    @Override
    public String reads() throws IOException, NullPointerException {

        is = new BufferedReader(new InputStreamReader(System.in));
        while ((input = is.readLine()) != null) {
            if (input.equals("exit")) {
                System.out.println("Exit!");
                System.exit(0);
            } else reads();
            return input;
        }
        return input;
    }
}