import java.util.Random;
class Point {
    private double x;
    private double y;
    private String color;

    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String move() {
        Random random = new Random();
        int deltaX = random.nextInt(100);
        int deltaY = random.nextInt(100);
        return "Point with coordinates (" + x + ", " + y + ") moved to: (" + Double.sum(x, deltaX) + ", " + Double.sum(y, deltaY) + ')';
    }

    public boolean isErased() {
        Random random = new Random();
        boolean delete = random.nextBoolean();
        System.out.println("\nPoint with coordinates (" + x +", " + y + ") has been erased?");
        return delete;
    }

}