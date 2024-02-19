public class twoInterface implements First, Second{
    @Override
    public void hello() {
        First.super.hello();
        Second.super.hello();
    }
}
