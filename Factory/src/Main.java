import Model.Point;
import Model.PointFactory;
import Model.StaticPoint;

public class Main {
    public static void main(String[] args) {
        System.out.println("#####################################");
        System.out.println("# THIS IS A FACTORY PATTERN EXAMPLE #");
        System.out.println("#####################################");
        System.out.println();

        Point p1 = PointFactory.newCartesianPoint(1, 2);
        System.out.println(p1);
        Point p2 = PointFactory.newPolarPoint(1, 2);
        System.out.println(p2);

        StaticPoint sp1 = StaticPoint.newCartesianPoint(1,2);
        System.out.println(sp1);
        StaticPoint sp2 = StaticPoint.newPolarPoint(1,2);
        System.out.println(sp2);
    }
}
