/**
 * Класс создания фигуры Круга на основе абстрактного класса ColoredFigure
 */
public class Circle extends ColoredFigure{
    public Circle(String color, int size) {
        super(color, size);
    }

    @Override
    String getName() {
        return "круг";
    }

    @Override
    double getArea() {
        double k = Math.PI;
        return size * size * k;
    }
    @Override
    String getSizeName(){
        return "радиус";
    }
}
