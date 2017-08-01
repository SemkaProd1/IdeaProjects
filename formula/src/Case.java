class Case<T extends Number> {
    private T x;
    private T y;

    Case(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public Case() {
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public int hashCode() {
        //привести х и у к инту.
         Integer x2 =(Integer) x;
        Integer y2 =(Integer) y;
        final int prime = 31;
        int result = 1;
        result = prime * result + x2;
        result = prime * result + y2;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Case other = (Case) obj;
        return x == other.x && y == other.y;
    }


        Case next;
        Case first;
        public Case( Case next, Case first) {
            this.next = next;
            this.first = first;
        }

        public int size() {
            if (first == null)
                return 0;

            int size = 0;
            for (Case element = first; element != null; element = element.next) {
                size++;
            }
            return size;
        }



        static <T extends Number> int sum(int x, int y) {

            return x+ y;
        }

        static double average(int x, int y) {
            return (x + y) / 2.0;
        }


}