
public class Main {
    public static void main(String[] args) {
        // Создаём объектную переменную интерфейса Base
        Base ref;
        // Создаём объектную переменную класса Alpha
        Alpha objA = new Alpha();
        objA.hello(); // вызываем метод hello
        objA.show(" объектная переменная ObjA");

        ref = objA;
        ref.show(" интерфейсная переменная ref");

        // Создаём объектную переменную класса Bravo
        Bravo objB = new Bravo();
        objB.hello();
        objB.show(" объектная переменная ObjB");

        ref = objB;
        ref.show(" интерфейсная переменная ref");
        // объект класса twoInterface
        twoInterface objC = new twoInterface();
        objC.hello();

    }
}