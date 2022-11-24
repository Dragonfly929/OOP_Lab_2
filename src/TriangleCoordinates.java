public class TriangleCoordinates {
    private final double x1;
    private final double y1;
    private final double x2;
    private final double y2;
    private final double x3;
    private final double y3;

    public TriangleCoordinates(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public boolean isValid () {
        double a = getSideAB();
        double b = getSideBC();
        double c = getSideAC();
        return !(a+b<c || b+c<a || a+c<b || a == 0 || b == 0 || c == 0);
    }
    public double getSideAB() {
        return Math.sqrt(Math.pow(((x2)-(x1)),2) + Math.pow(((y2)-(y1)),2));
    }

    public double getSideBC() {
        return Math.sqrt(Math.pow(((x3)-(x2)),2) + Math.pow(((y3)-(y2)),2));
    }

    public double getSideAC() {
        return Math.sqrt(Math.pow(((x1)-(x3)),2) + Math.pow(((y1)-(y3)),2));
    }

    public double getPerimeter() {
        System.out.println("Triangle's Perimeter: ");
        if (isValid()){
            double A = getSideAB(), B = getSideBC(), C = getSideAC();
            return (A + B + C);
        } return 1;
    }

    public double getArea() {
        System.out.println("Triangle's Area: ");
        double perimeter = getPerimeter();
        double s = (perimeter * 0.5);
        double A = getSideAB(), B = getSideBC(), C = getSideAC();
        return Math.sqrt(s * (s - A) * (s - B) * (s - C));
    }
}
