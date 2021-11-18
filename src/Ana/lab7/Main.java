package Ana.lab7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> shapes = new ArrayList<>();
        shapes.add(new Square());
        shapes.add(new Rectangle());
        shapes.add(new Triangle());
        shapes.add(new Circle());

        for (Figure shape : shapes) {
            shape.printInfo();
        }

        Figure maxPerimeterShape = FigureController.findByMaxPerimeter(shapes);
        Figure maxAreaShape = FigureController.findByMaxArea(shapes);
        System.out.printf("Max Perimeter (cm): %.2f%n", maxPerimeterShape.getPerimeter());
        System.out.printf("Max Area (cm^2): %.2f%n", maxAreaShape.getArea());
    }
}