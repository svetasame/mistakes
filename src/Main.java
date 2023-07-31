import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        // задание 1
        String input = checkEmpty ();
        System.out.println("Введеная строка: " + input);

        // задание 2 - все работает
        int [] intArray = new int [] {1,5,6,8,7,6,9,5,41,5,6,2,5,4};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }


        // задание 3
        // поменять местами ошибки:
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }


        // задание 4
        float number = checkFloat();
        System.out.println("Введенное число: " + number);


    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

    public static float checkFloat () {
        Scanner scanner = new Scanner(System.in);
        float num = 0.0f;
        boolean isFloat = false;
        while(!isFloat) {
            System.out.println("Введите дробное число: ");
            try {
                num = Float.parseFloat(scanner.nextLine());
                isFloat = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка. Вы ввели не число.");
            }
        }
        return num;
    }

    public static String checkEmpty () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();

        if (str.isEmpty()){
        throw new RuntimeException("Пустые строки вводить нелья.");
        }
        return str;
    }



}
