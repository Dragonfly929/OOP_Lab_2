public class Cylinder {

    private double x;
    private double y;
    private double z;
    private double radius;
    private double height;
    private String color;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    public double getZ() { return z; }
    public void setZ(double z) { this.z = z; }

    public double getRadius() { return radius; }
    public void setRadius(double radius)  {
        if( this.radius < 0 )
            this.radius =  0.00;
        else
            this.radius = radius;
    }

    public double getHeight() { return height; }
    public void setHeight(double height)  {
        if( this.height < 0 )
            this.height =  0.00;
        else
            this.height = radius;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getTotalSurfaceArea() {
        System.out.println("Cylinder's area: ");
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }

    public double getCylinderVolume() {
        System.out.println("Cylinder's volume: ");
        return Math.PI * radius*radius * height;
    }
}
