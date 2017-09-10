import java.io.*;
import java.util.ArrayList;

public class FileScanner {
    BufferedReader is = null;
    public int scan(String word) throws IOException {

        int i = 0;
        word = null;
        String path = "D://Folder1//";
        String exit = "exit";
        File dir = new File(path);
        ArrayList<String> files1 = new ArrayList<>();
        ArrayList<String> files2 = new ArrayList<>();

        for (File folder : dir.listFiles()) {
            if (!folder.isDirectory()) {
                files1.add(folder.getName());
            }
        }
        for (String aListFile : files1) {
            files2.add(path + aListFile);
        }
        String line;
        for (String listOf : files2) {
            BufferedReader fileReader = new BufferedReader(new FileReader(listOf));
            while ((line = fileReader.readLine()) != null) {
                if (line.contains(word)) {
                    i++;
                }
            }
        }
        is = new BufferedReader(new InputStreamReader(System.in));
        while ((word = is.readLine()) != null) {
            if (word.equals(exit)) {
                System.out.println("Exit!");
                System.exit(0);
            } else scan(word);
            return i;

        }
        return i;
    }
}