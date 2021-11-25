package Ana.lab8;

public class Sphere implements GeometricBody {
    double radius;

    public Sphere() {
        this(1);
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    public String getName() {
        return "Sphere";
    }

    public double getSurface() {
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return 4.0 / 3 * Math.PI * radius * radius * radius;
    }

    public void printInfo() {
        System.out.printf("Name: %s%n", getName());
        System.out.printf("Surface (cm^2): %.2f%n", getSurface());
        System.out.printf("Volume (cm^3): %.2f%n \n", getVolume());
    }
}