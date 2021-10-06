package Ana.lab2.task1;

//theBox class

public class Box {
    double height;
    double width;
    double depth;

    // Without parameters
    public Box() {
        height = 1;
        width = 1;
        depth = 1;
    }

    // With 1 parameter
    public Box(double value) {
        height = value;
        width = value;
        depth = value;
    }

    // With 3 parameters
    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    // Calculating the surface
    public double Area() {
        return 2 * (height * width + height * depth + width * depth);
    }

    // Calculating the volume
    public double Volume() {
        return height * width * depth;
    }

}

