public class Alpha implements Base {

    // Описание обычного метода
    @Override
    public void hello() {
        System.out.println("Объект класса Alpha");
    }
    @Override
    // Описание метода с кодом по умолчанию
    public void show(String txt){
        System.out.println("Класс Alpha" + txt);
    }

}
