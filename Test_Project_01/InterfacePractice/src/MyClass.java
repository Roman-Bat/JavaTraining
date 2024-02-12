// Мой класс, наследник интерфейса MyInterface
public class MyClass implements MyInterface, First, Second {

    // Переопределение методов интерфейса MyInterface
    @Override
    public int getNumber(double x) {
        return (int)(x);
    }
    @Override
    public char getSymbol(int n) {
        return (char) ('A' + n);
    }
    // Метод интерфейса First
    @Override
    public void hello() {
        System.out.println("Метод из интерфейса First");
    }
    // Метод интерфейса Second
    @Override
    public void hi() {
        System.out.println("Метод из интерфейса Second");
    }

}
