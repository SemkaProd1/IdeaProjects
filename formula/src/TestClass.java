import java.util.*;

public class TestClass {

    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();
        states.add("Германия");
        states.add("Франция");
        states.add("Италия");
        states.add("Испания");
        states.add("Испа");
        states.add("Иния");
        states.add("спания");
        states.add("Иания");
        states.add("И");
        states.add("Иания");


        Iterator<String> iter = states.iterator();
        while(iter.hasNext()){

            System.out.println(iter.next());

        }
    }
}