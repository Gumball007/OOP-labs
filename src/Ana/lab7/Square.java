package Ana.lab7;

public class Square implements Figure {
    double side;

    public Square() {
        this(1);
    }

    public Square(double side) {
        this.side = side;
    }

    public String getName() {
        return "Square";
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getArea() {
        return (side * side);
    }

    public void printInfo() {
        System.out.printf("Name: %s%n", getName());
        System.out.printf("Perimeter (cm): %.2f%n", getPerimeter());
        System.out.printf("Area (cm^2): %.2f%n \n", getArea());
    }
}