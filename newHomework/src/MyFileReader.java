import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;

public class MyFileReader implements Reader {
    @Override
    public String reads() throws IOException {
        Scanner scanner = new Scanner(Paths.get("D:\\Folder1\\txt.txt"), StandardCharsets.UTF_8.name());
        String data;
        while (scanner.hasNext()) {
            data = scanner.next();
            return data;
        }
        scanner.close();
        return null;
    }

}