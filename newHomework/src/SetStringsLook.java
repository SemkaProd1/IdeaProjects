import java.util.Collections;
import java.util.TreeSet;

class SetStringsLook {
    private final Object lock = new Object();
    private TreeSet<String> mySet = new TreeSet<>();
    String str;

    SetStringsLook(String str){
        this.str = str;
    }

    void stringToSet(String str){
        synchronized (lock){
        Collections.addAll(mySet, str.split(" "));
        }
        //not sure.
    }

    TreeSet<String> getSet() {
        return mySet;
    }

}