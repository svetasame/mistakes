import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\KovalenkoS\\IdeaProjects\\mistakes\\src\\names.txt");
        List<String[]> list = readFile(file);
        changeList(list);
        fileWriter(list,file);




//        Integer[] array1 = new Integer[]{1,5,6,null,0,9,5,6,4,null,8,6,2,null,5,6,5};
//        //System.out.println(CheckArray(array1, 19));
//
//        int[][] array21 = new int[][]{{1,5,6,7}, {4,5,6,5}};
//        int[][] array211 = new int[][]{{1,5,6,7}, {4,5,6,5}, {1,5,6,7}, {4,5,6,5}};
//        int[][] array2112 = new int[][]{{0,0,1,1}, {1,1,0,1}, {0,0,1,1}, {1,1,0,0}};

        //System.out.println(printErrors(FindInArray(null,5,15)));
        //System.out.println(sumArray(array21));
        //System.out.println(sumArray(array211));
        //System.out.println(sumArray(array2112));
        //System.out.println(CheckNullArray(array1));
//        Answer ans = new Answer();
//        try {
//            ans.arrayOutOfBoundsException();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Выход за пределы массива");
//        }
//
//        try {
//            ans.divisionByZero();
//        } catch (ArithmeticException e) {
//            System.out.println("Деление на ноль");
//        }
//
//        try {
//            ans.numberFormatException();
//        } catch (NumberFormatException e) {
//            System.out.println("Ошибка преобразования строки в число");
//        }

//        int[] a = new int[]{12, 8, 16};
//        int[] b = new int[]{4, 2, 4};
//        //System.out.println(divArrays(a,b));
//        System.out.println(subArrays(a,b));




    }

    public static List<String[]> readFile (File file) {
        List<String[]> list = new ArrayList<>();

        try {
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while((line = br.readLine()) != null){
                list.add(line.split("="));

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static void changeList(List<String[]> list1){
        for(String[] el: list1){
            if (!checkInt(el[1]) && !el[1].equals("?")){
                throw new RuntimeException(el[1] + " не является числом или знаком '?'");
            }
            if (el[1].equals("?")) el[1] = String.valueOf(el[0].length());

        }
    }

    public static boolean checkInt(String line){
        try {
            Integer.valueOf(line);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void fileWriter (List<String[]> list1, File file) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (String[] el:list1){
                bw.write(el[0]+"="+el[1]);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static int[] subArrays(int[] a, int[] b){
        int [] c = new int[a.length];
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] - b[i];
            }
            return c;
        }
        return new int []{0};
    }


    public static int[] divArrays(int[] a, int[] b){
        int [] c = new int[a.length];
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] * b[i];
            }
            return c;
        }
        else return new int []{0};


    }




    public static int CheckArray (int[] array, int checkSize) {
        if (array.length  < checkSize) {
            return -1;
        } else return array.length;
    }


    public static String printErrors (int value) {
        if (value == -1) return ("Длина массива меньше заданного минимума");
        if (value == -2) return ("Искомый элемент не найден");
        if (value == -3) return ("Вместо массива пришел ноль");
        return "Индекс искомого элемента = " + value;
    }


    public static int FindInArray (int[] array, int checkSize, int element) {
        if (array == null) return -3;
        if (array.length  < checkSize) {
            return -1;
        }
        for (int i = 0; i < array.length; i ++) {
                if (array[i] == element) return i;
            }
        return -2;
    }

    public static int sumArray (int[][] array1) {
        int sum = 0;
        if (array1.length != array1[0].length) {
            throw new RuntimeException("Массив не является квадратным");
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                if (array1[i][j] != 0 && array1[i][j] != 0) {
                    throw new RuntimeException("В ячейке " + i + " " + j + " значение не равно 0 или 1: " + array1);
                }
                sum += array1[i][j];
            }
        }
        return sum;
    }


    public static String CheckNullArray (Integer[] array) {
        StringBuilder elements = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) elements.append(i + " ");

        }
        if (elements.length() > 0) {
            throw new RuntimeException("Индексы элементов, содержащих null: " + elements);
        }
        else return "Массив не содержит null";

    }

    public static void arrayOutOfBoundsException(){

    }





}
