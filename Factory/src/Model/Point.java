package Model;

public class Point {
    private double x, y;

    protected Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point {\n" +
                    "\tx = " + x + "\n" +
                    "\ty = " + y + "\n" +
                "}";
    }
}
