package Ana.lab7;

public class Circle implements Figure {
    double radius;

    public Circle() {
        this(3);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getName() {
        return "Circle";
    }

    public void printInfo() {
        System.out.printf("Name: %s%n", getName());
        System.out.printf("Perimeter (cm): %.2f%n", getPerimeter());
        System.out.printf("Area (cm^2): %.2f%n \n", getArea());
    }
}