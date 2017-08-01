import java.util.ArrayList;

public class Array3 {

    public static void main (String [] arg) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<20;i++) {
            list.add((int) (Math.random() * i));
            System.out.print(list.get(i)+" ");
        }
        list.remove(9); //Removable index
        System.out.println();
        for (Integer aList : list) {
            System.out.print(aList + " ");
        }
    }
}