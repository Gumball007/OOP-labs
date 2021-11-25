package Ana.lab8;

public class Parallelepiped implements GeometricBody {
    double height;
    double width;
    double depth;

    public Parallelepiped() {
        this(7, 2.1, 3);
    }

    public Parallelepiped(double width, double height, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public String getName() {
        return "Parallelepiped";
    }

    public double getSurface() {
        return width * height * 2 + width * depth * 2 + height * depth * 2;
    }

    public double getVolume() {
        return width * height * depth;
    }

    public void printInfo() {
        System.out.printf("Name: %s%n", getName());
        System.out.printf("Surface (cm^2): %.2f%n", getSurface());
        System.out.printf("Volume (cm^3): %.2f%n \n", getVolume());
    }
}