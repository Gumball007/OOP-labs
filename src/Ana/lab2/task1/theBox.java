package Ana.lab2.task1;

//theBox class

public class theBox {
    double height;
    double width;
    double depth;

    // Without parameters
    public theBox() {
        height = 1;
        width = 1;
        depth = 1;
    }

    // With 1 parameter
    public theBox(double value) {
        height = value;
        width = value;
        depth = value;
    }

    // With 3 parameters
    public theBox(double height, double width, double depth) {
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

