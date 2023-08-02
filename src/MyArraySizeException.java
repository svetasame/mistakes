public class MyArraySizeException extends RuntimeException{
    // рантайм потому что мы проверяем иф
    public MyArraySizeException (int size, int size2)
    {
        super(" Неподходящий размер массива, ваш массив: " + size + "x" + size2);
    }
}
