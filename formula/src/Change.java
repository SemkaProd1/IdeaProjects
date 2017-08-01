public class Change<T extends Number> extends Case {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    @Override
    public String toString() {
        return super.toString();
    }

    public Change(Case<Number> next, Case<Number> first) {
        super(next, first);
    }

    public static void main(String[] args) {

        System.out.println(sum(4,5));
        System.out.println(average(5,3));
        Case<Integer> object1 = new Case<>(3, 4);
        Case<Integer> object2 = new Case<>(4,6);
        System.out.println(object1.equals(object2));
        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());
        int[] a = new int[4];
        a[0] = 1;
        a[1] = 2;
        a[2] = 4;
        a[3] = 100;





    }

}
