import java.util.ArrayList;
import java.util.List;


public class UnionArrays {

    public static List<Integer> UnionArrays(List<Integer> first, List<Integer> second)
    {
        List<Integer> list = new ArrayList<>();

        int point;

        if (first.size() > second.size()) {
            point = first.size();
        }
        else {point = second.size();}

        for (int i = 0; i < point; i++) {
            list.add(first.get(i));
            list.add(second.get(i));
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(4);
        System.out.println(UnionArrays(list1, list2));
    }
}
