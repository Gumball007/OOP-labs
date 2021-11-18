package Ana.lab7;

public class Rectangle implements Figure {
    double length;
    double width;


    public Rectangle() {
        this(6.3, 7);
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public String getName() {
        return "Rectangle";
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public double getArea() {
        return width * length;
    }

    public void printInfo() {
        System.out.printf("Name: %s%n", getName());
        System.out.printf("Perimeter (cm): %.2f%n ", getPerimeter());
        System.out.printf("Area (cm^2): %.2f%n \n", getArea());
    }
}