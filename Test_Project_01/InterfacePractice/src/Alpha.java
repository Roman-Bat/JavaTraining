//Класс Alpha реализует интерфейс Base
public class Alpha implements Base{
    String word;
    Alpha(String txt) {
        word = txt;
    }
    // Метод интерфейса Base
    @Override
    public void show() {
        System.out.println("Объект класса Alpha");
        System.out.println("Текстовое поле:" + word);
    }
}
