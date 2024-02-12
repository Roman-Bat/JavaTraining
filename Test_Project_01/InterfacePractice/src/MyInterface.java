/**
 * Интерфейс со статической константой и двумя методами
 */
public interface MyInterface {
    int NUMBER = 100; // Целочисленная константа
    int getNumber(double x); // Метод принимает на вход double а возвращает int
    char getSymbol(int n); // Метод принимает на вход int, а возвращает char
}
