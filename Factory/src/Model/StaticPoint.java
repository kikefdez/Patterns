package Model;

public class StaticPoint {
    private double x, y;

    private StaticPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "StaticPoint {\n" +
                "\tx = " + x + "\n" +
                "\ty = " + y + "\n" +
                "}";
    }

    public static StaticPoint newCartesianPoint(double x, double y){
        return new StaticPoint(x, y);
    }

    public static StaticPoint newPolarPoint(double rho, double theta){
        return new StaticPoint(rho * Math.cos(theta), rho * Math.sin(theta));
    }
}
