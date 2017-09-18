import java.util.Collections;
import java.util.TreeSet;

class SetStrings {
    private TreeSet<String> mySet = new TreeSet<>();
    String str;

    SetStrings(String str){
        this.str = str;
    }

    void stringToSet(String str){
        Collections.addAll(mySet, str.split(" "));
    }

    TreeSet<String> getSet() {
        return mySet;
    }

}