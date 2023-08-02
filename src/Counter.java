import java.io.IOException;

public class Counter implements AutoCloseable {
    private Integer value = 0;

    @Override
    public void close() throws Exception {
        value = null;

    }

    public void add() throws IOException {
        if (value == null) throw  new IOException("значение закрыто");
        value += 1;
    }

    public Integer getValue() throws IOException {
        if (value == null) throw  new IOException("значение закрыто");
        return this.value;
    }
}
