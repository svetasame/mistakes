public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(int index1, int index2){
        super("Не удалось преобразовать в инт элементы: [" + index1 + "][" + index2+"]");
    }

}
