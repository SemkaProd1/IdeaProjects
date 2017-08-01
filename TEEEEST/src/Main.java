
import java.util.ArrayList;
import java.util.List;


public class Main {

    private static double calculateCoast(List<Shape> shapes, Color filterColor) {
        double cost = 0;

        for (Shape shape : shapes) {
            if (shape.color() == filterColor) {
                cost += shape.size() * shape.color().coast;
            }
        }
        return cost;
    }

    static double findMostExpensive(List<Shape> shapes, Color filterColor) {
        double d = shapes.size() * (shapes.get(0).color().coast);

        for (int i = 0; i < shapes.size(); i++) {
            double d2 = shapes.get(i).size() * (shapes.get(i).color().coast);
            if (d < d2) {
                d = d2;
            }
        }
        return d;
    }


    public static void main(String[] args) {

        ArrayList<Shape> Blocks = new ArrayList<>();

        Shape circle1 = new Circle(1, "RED");
        Shape circle2 = new Circle(1, "GREEN");
        Shape circle3 = new Circle(2, "GREEN");
        //Shape circle4 = new Circle(3, "GREEN");
        Shape square1 = new Square(1, "RED");
        Shape square2 = new Square(2, "BLUE");

        Blocks.add(circle1);
        Blocks.add(circle2);
        Blocks.add(square1);
        Blocks.add(square2);
        Blocks.add(circle3);
        //Blocks.add(circle4);

        System.out.println(calculateCoast(Blocks, Color.BLUE));
        System.out.println(calculateCoast(Blocks, Color.RED));


        System.out.println(findMostExpensive(Blocks, Color.GREEN));
    }


}