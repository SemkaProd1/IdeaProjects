public class Circle implements Shape {

    int i;
    String color;

   public Circle(int i, String color){
        super();
        this.i = i;
        this.color = color;
    }


    @Override
    public double size() {
        double s = i * i* Math.PI;
        return s;
    }

    @Override
    public Color color(){
        return Color.valueOf(color);
    }
}