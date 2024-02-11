/**
 * ColoredFigure - абстрактный класс на основании которого создаются
 * фигуры
 */
abstract class ColoredFigure {
    String color; // поле цвет фигуры
    int size; // поле размер стороны фигуры

    /**
     * Конструктор абстрактного класса
     * @param color - назначаем цвет фигуры
     * @param size - устанавливаем размер стороны фигуры
     */
    public ColoredFigure(String color, int size) {
        this.color = color;
        this.size = size;
    }
    // Метод отображения информации об объекте
    void show(){
        System.out.println("Фигура:" +color+ " " + getName());
        System.out.printf("Площадь: %.3f\n",getArea());
        StringBuilder line = new StringBuilder();
        for (int k = 1; k < 30; k++){
            line.append("*");
        }
        System.out.println(line.toString());
    }
    // Метод возврата названия параметра определяющего характерный размер фигуры
    String getSizeName(){
        return "сторона";
    }
    abstract String getName(); //Название фигуры
    abstract double getArea(); //Площадь фигуры

}
