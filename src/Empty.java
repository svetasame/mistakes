import java.util.EmptyStackException;

public class Empty extends NullPointerException {
    public Empty (int index) {
        super("Вы обратились к пустому элементу массива " + index);
    }

    public Empty () {
        super("Вы обратились к пустому элементу массива ");
    }
}
