package Ana.lab8;

public class Cub implements GeometricBody {
    double side;

    public Cub() {
        this(1);
    }

    public Cub(double side) {
        this.side = side;
    }

    public String getName() {
        return "Cub";
    }

    public double getSurface() {
        return (side * side) * 6;
    }

    public double getVolume() {
        return side * side * side;
    }

    public void printInfo() {
        System.out.printf("Name: %s%n", getName());
        System.out.printf("Surface (cm^2): %.2f%n", getSurface());
        System.out.printf("Volume (cm^3): %.2f%n \n", getVolume());
    }
}