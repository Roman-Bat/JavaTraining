//Класс Bravo реализует интерфейс Base
public class Bravo implements Base {
    int number;
    Bravo (int n){
        number = n;
    }

    @Override
    public void show() {
        System.out.println("Объект класса Bravo");
        System.out.println("Целочисленное поле: " + number);
    }
}
