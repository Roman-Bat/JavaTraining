/**
 * Класс Квадрат
 */
public class Square extends ColoredFigure {

    public Square(String color, int size) {
        super(color, size);
    }

    @Override
    String getName() {
        return "квадрат";
    }

    @Override
    double getArea() {
        double k = 1;
        return size * size * k;
    }
}
