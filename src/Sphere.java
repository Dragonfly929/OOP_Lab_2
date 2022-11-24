public class Sphere {
    private int diameter;
    private double area;
    private double volume;

    public Sphere(int diameter) {
        this.diameter = diameter;
        setSphereVolume();
        setSphereArea();
    }

    public void setSphereDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getSphereDiameter() {
        return diameter;
    }

    public void setSphereVolume() {
        volume = Math.PI * (4.0 / 3.0) *
                Math.pow((double) diameter / 2.0, 3);
    }

    public double getSphereVolume() {
        return volume;
    }

    public double getSphereArea() {
        return area;
    }

    public void setSphereArea() {
        area = Math.PI * 4.0 *
                Math.pow((double) diameter / 2.0, 2);
    }
    public String toString() {
        String info1 = Integer.toString(diameter);
        String info2 = Double.toString(area);
        String info3 = Double.toString(volume);
        return "Diameter: " +
                info1 + "\t" + "Area: " + info2 + "\t" +
                "Volume: " + info3 + "\t";
    }
}