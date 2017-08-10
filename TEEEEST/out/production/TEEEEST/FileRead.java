import java.io.File;
import java.io.IOException;

public class FileRead {
        public static void main(String[] a)throws IOException {

            showDir(0, new File("D:\\BIRD"));
        }
        static void showDir(int indent, File file) throws IOException {
            for (int i = 0; i < indent; i=i+1){
            System.out.print('-');
            }
            System.out.println(file.getName());

            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (int i = 0; i < files.length; i++) {
                    showDir(indent + 1, files[i]);
                }
            }
        }
    }