package Ana.lab8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GeometricBody> shapes = new ArrayList<>();
        shapes.add(new Cub());
        shapes.add(new Sphere());
        shapes.add(new Parallelepiped(1, 2, 3));

        for (GeometricBody shape : shapes) {
            shape.printInfo();
        }

        GeometricBody maxSurfaceShape = GeometricBodyController.findByMaxSurface(shapes);
        GeometricBody maxVolumeShape = GeometricBodyController.findByMaxVolume(shapes);
        System.out.printf("Max Surface: %.2f%n", maxSurfaceShape.getSurface());
        System.out.printf("Max Volume: %.2f%n", maxVolumeShape.getVolume());
    }
}