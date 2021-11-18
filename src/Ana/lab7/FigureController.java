package Ana.lab7;

import java.util.List;

public class FigureController {
        public static Figure findByMaxPerimeter(List<Figure> list) {
        Figure result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            Figure temp = list.get(i);
            if (temp.getPerimeter() > result.getPerimeter()) {
                result = temp;
            }
        }
        return result;
    }

    public static Figure findByMaxArea(List<Figure> list) {
        Figure result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            Figure temp = list.get(i);
            if (temp.getArea() > result.getArea()) {
                result = temp;
            }
        }
        return result;
    }
}