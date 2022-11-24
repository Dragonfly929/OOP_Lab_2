public class Rectangle {
    private double x;
    private double y;
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setLength(int width) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }


    public double getArea() {
        return this.length * this.width;
    }

    public void getPerimeter() {
        // Calculate the 'perimeter' using the formula
        double perimeter = 2 * (length + width);

        System.out.println("The perimeter of the given rectangle of width= "
                + length + " and height= " + width + ": "
                + perimeter);
    }

    public void draw() {
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= length; j++) {
                if (i == 1 || i == width || j == 1 || j == length)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void display() {
        System.out.println("Width: " + this.length);
        System.out.println("Height: " + this.width);
        System.out.println("Area: " +  getArea());
        getPerimeter();
    }
}