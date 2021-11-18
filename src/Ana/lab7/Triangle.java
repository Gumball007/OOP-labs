package Ana.lab7;

public class Triangle implements Figure {
    double base;
    double side1;
    double side2;
    double height;


    public Triangle() {
        this(9, 7, 4.5, 3.2);
    }

    public Triangle(double base, double side1, double side2, double height) {
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    public String getName() {
        return "Triangle";
    }

    public double getPerimeter() {
        return base + side1 + side2;
    }

    public double getArea() {
        return (base * height) / 2;
    }

    public void printInfo() {
        System.out.printf("Name: %s%n", getName());
        System.out.printf("Perimeter (cm): %.2f%n", getPerimeter());
        System.out.printf("Area (cm^2): %.2f%n \n", getArea());
    }
}