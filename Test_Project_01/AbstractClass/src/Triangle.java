/**
 * Класс создания фигуры Треугольника на основе абстрактного класса ColoredFigure
 */
public class Triangle extends ColoredFigure{

    //Конструктор класса
    public Triangle(String color, int size) {
        super(color, size);
    }

    // Переопределение методов суперкласса
    @Override
    String getName() {
        return "треугольник";
    }

    @Override
    double getArea() {
        double k = Math.sqrt(3)/4;
        return size * size * k;
    }
}
