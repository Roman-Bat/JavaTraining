/**
 * Главный класс
 */
public class Main  {
    public static void main(String[] args) {

        MyClass obj = new MyClass();

        System.out.println("Статическая константа: " + MyClass.NUMBER);
        System.out.println("Целое число: " + obj.getNumber(12.5));
        System.out.println("Символ: " + obj.getSymbol(3));
        obj.hello();
        obj.hi();

        Base ref;
        // Объект класса Alpha:
        ref = new Alpha("текст");
        ref.show();
        // Объект класса Bravo:
        ref = new Bravo(123);
        ref.show();
    }

}