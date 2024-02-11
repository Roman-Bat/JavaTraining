

public class App {
    public static void main(String[] args) {
        Triangle T = new Triangle("Красный", 2);
        Square S = new Square("Черный", 3);
        Circle C = new Circle("Желтый", 1);

        System.out.println("Использование объектных переменных подкласса");
        T.show();
        S.show();
        C.show();

        //Объектная переменная суперкласса:
        ColoredFigure F;
        //Отображение информации об объектах через
        //объектную переменную абстрактного суперкласса:
        System.out.println("Использование объектной переменной абстрактного суперкласса");
        F = T; // Triangle
        F.show();
        F = S; // Square
        F.show();
        F = C; // Circle
        F.show();

    }
}