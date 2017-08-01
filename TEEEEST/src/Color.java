public enum Color {

    RED(20),
    GREEN(10),
    BLUE(40);

    public final int coast;

    Color (int coast){
        this.coast = coast;
    }

    @Override
    public String toString(){
        return (Color.this.name());

    }
}