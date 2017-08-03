import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetterArr<T> {

    public class Factory {
        int size = 5;

        public Factory(){

        }
    }

    Factory factory = new Factory();

    List<T> list = new ArrayList<>(factory.size);
    int size = factory.size;

    public GetterArr(){

    }

    public void add(T elem)  {
        if (list.size() < size) {
            list.add(elem);
        }else {
            list.remove(0);
            list.add(elem);
        }

    }
    public List<T> get() throws IOException {
        return list;
    }

    public static void main(String[] args) {

        GetterArr c = new GetterArr();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        c.add(6);
        c.add(7);
        try {
            System.out.println(c.get());
        } catch (IOException e) {
            if (c.size <= 0) {
                System.out.println("Is Empty");
            }
        }
    }
}