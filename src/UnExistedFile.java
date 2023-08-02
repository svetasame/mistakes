import java.io.FileNotFoundException;

public class UnExistedFile extends FileNotFoundException {
    public UnExistedFile() {
        super("Такого файла не существует");

    }

    public UnExistedFile(String path) {
        super("Такого файла не существует " + path);

    }
}
