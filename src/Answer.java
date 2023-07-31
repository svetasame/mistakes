public class Answer {
    public static void arrayOutOfBoundsException() {
        int[] array = new int[]{1, 23, 36, 9, 5, 5, 5};
        for (int i = 0;i <= array.length; i++) {
            if (i == array.length) System.out.println(array[i]);
        }
    }
    public static void divisionByZero() {
        int f = 5/0;
        System.out.println(f);
    }
    public static void numberFormatException() {
        String str = "s";
        int num = Integer.parseInt(str);
        System.out.println(num);

    }

}
