import java.util.Collections;
import java.util.TreeSet;

class SetStringsSinchMethod {
    private TreeSet<String> mySet = new TreeSet<>();
    String str;

    SetStringsSinchMethod(String str){
        this.str = str;
    }

    synchronized void stringToSet(String str){
        Collections.addAll(mySet, str.split(" "));
    }

    synchronized TreeSet<String> getSet() {
        return mySet;
    }

}