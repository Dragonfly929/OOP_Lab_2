public class Square {
    private double x;
    private double y;
    private int width;
    private final double[] lineWeight = {0.05, 0.09, 0.13, 0.2, 0.5, 1, 2};
    private final String[] lineType = {"DASHDOT", "DASHED", "DOT", "ZIGZAG"};

    public Square(int width) {
        this.width = width;
    }
    public double getX() { return x; }
    public double getY() { return y; }
    public int getWidth() {
        return width;
    }
    public double[] getLineWeight() { return lineWeight; }
    public String[] getLineType() { return lineType; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setWidth(int width) {
        this.width = width;
    }

    public double getArea() {
        return this.width * this.width;
    }

    public double getPerimeter() {
        return 4 * this.width;
    }

    public double getDiagonalLength() {
        return this.width * Math.sqrt(2);
    }
}
