import java.util.Iterator;

public class Test {

    Iterator<Integer> iterator;

    public Test(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    public int getThirdElementFromTheEnd() {
        while (iterator.hasNext()){
        iterator.next();
        }
        iterator.remove();

        return 0;
    }
}