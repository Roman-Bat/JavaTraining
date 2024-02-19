public interface Base {
    //Метод с кодом по умолчанию
    default void show(String txt){
        System.out.println("Интерфейс Base" + txt);
    }
    void hello();
}
