import java.util.TreeSet;

class Comp implements Comparable {

    int month;
    int day;

    Comp(int month, int day) {
        this.month = month;
        this.day = day;
    }

    @Override
    public int compareTo(Object obj) {
        Comp entry = (Comp) obj;

        int result = month - entry.month;
        if(result != 0) {
            return result;
        }

        result = day - entry.day;
        if(result != 0) {
            return result;
        }
        return 0;
    }

}

public class DateComp {

    public static void main(String[] args) {
        TreeSet<Comp> ex = new TreeSet<Comp>();
        ex.add(new Comp(7, 11));
        ex.add(new Comp(8, 3));

        for(Comp e : ex) {
            System.out.println("month: " + e.month + ", day: " + e.day);
        }
    }

}