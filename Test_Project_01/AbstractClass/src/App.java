/**
 * Главный класс программы, в которой, на основе абстрактного класса, создаются классы фигур
 */

public class App {
    public static void main(String[] args) {
        Triangle T = new Triangle("Красный", 2); // Создаем объект класса треугольника
        Square S = new Square("Черный", 3); // Создаем объект класса квадрата
        Circle C = new Circle("Желтый", 1); // Создаем объект класса круга

        System.out.println("Использование объектных переменных подкласса"); // Подзаголовок строки
        System.out.println(createLine(50)); // Разделительная черта
        // Отображение информации об объектах:
        T.show();
        S.show();
        C.show();

        //Объектная переменная суперкласса:
        ColoredFigure F;

        //Отображение информации об объектах через
        //объектную переменную абстрактного суперкласса:

        System.out.println("\nИспользование объектной переменной абстрактного суперкласса");
        System.out.println(createLine(50)); // разделительная черта

        F = T; // Треугольник
        F.show();
        F = S; // Квадрат
        F.show();
        F = C; // Круг
        F.show();

    }

    /**
     * Метод создания разделительной черты
     * @param length - длина черты  в символах
     * @return - возвращаем линию в строке
     */
    public static String createLine(int length){
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < length; i ++){
            temp.append("-");
        }
        return temp.toString();
    }
}