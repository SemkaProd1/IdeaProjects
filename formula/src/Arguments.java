
public class Arguments {

    public static void main(String[] args) {
        String[] words = {"My","name","is", "Ilya","but","I","don't","like","it"};
        int maxLengthString = 0;
        for (String word : words) {
            if (word.length() > maxLengthString) {
                maxLengthString = word.length();
            }
        }
        for (String word : words) {
            if (word.length() == maxLengthString) {
                System.out.println(word);
            }
        }

    }
}