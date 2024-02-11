public class Triangle extends ColoredFigure{

    public Triangle(String color, int size) {
        super(color, size);
    }

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
