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
//        try {
//            doSomething();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        try (Counter counter = new Counter()){
//            counter.add();
//            System.out.println(counter.getValue());
//            counter.close();
//            System.out.println(counter.getValue());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//        try {
//            int a = 5/0;
//        } catch (ArithmeticException e) {
//            throw new DivisionByZero();
//        }

//        try {
//            Integer [] ab = new Integer[]{null,5,3,6,null};
//            ab[0] += 1;
//
//        } catch (NullPointerException e) {
//            throw new Empty(0);
//        }

//        try {
//            File file = new File("text.txt");
//            FileReader reader = new FileReader(file);
//            BufferedReader br = new BufferedReader(reader);
//
//        } catch (FileNotFoundException e) {
//            throw new UnExistedFile();
//        }

        String [] [] array = new String[][] {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        String [] [] array1 = new String[][] {{"1","2","3"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        String [] [] array2 = new String[][] {{"1","2","3","4"},{"1",null,"3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        String [] [] array3 = new String[][] {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};



        try {
            int sum = arrayIn(array1);
            System.out.println(sum);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }






    }


    public static int arrayIn (String [][] array) {
        if(array.length != 4 || array[0].length !=4) {
            throw new MyArraySizeException(array.length, array[0].length);
        }
        int sum = 0;
        for (int i = 0; i <array.length; i++){
            for (int j = 0; j< array[0].length; j++){
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }

            }
        }
        return sum;

    }


    public static void doSomething() throws IOException{

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
