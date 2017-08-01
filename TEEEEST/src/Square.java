public class Square implements Shape{

     int i;
    private String color;

    Square(int i, String color){
        super();
        this.i = i;
        this.color = color;
    }


    @Override
    public double size() {
        double s = Math.pow(i,2);
        return s;
    }

    @Override
    public Color color(){
        return Color.valueOf(color);
    }
}
