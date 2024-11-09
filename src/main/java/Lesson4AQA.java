import java.util.Arrays;

public class Lesson4AQA {

    public static void main(String[] args) {
        Lesson4AQA.lenArray(8,4);


    }

    public static void printThreeWords() {
        String wordOne = "Orange";
        String wordTwo = "Banana";
        String wordThree = "Apple";
        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);

    }

    public static void checkSumSing() {

        int a = 15;
        int b = 3;
        int sum = a + b;
        if (sum > 0) {

            System.out.println("Сумма больше 0");
        } else {
            System.out.println("Сумма меньше 0");
        }
    }

    public static void printColor() {
        int value = 190;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value < 0 || value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");

        }
    }

    public static void compareNumbers() {
        int a = 0;
        int b = 100;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");

        }

    }

    public static boolean twoNumber(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void plusNumber(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean trueNumber(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void numberString(String a, int b) {
        for (int i = 1; i <= b; i++) {
            System.out.println(a);
        }
    }

    public static boolean leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void arrayList() {
        int[] array = {1, 0, 1, 0, 1, 0, 0, 1, 1};
        for (int i = 0; i < array.length; i++)
            array[i] = (array[i] == 1) ? 0 : 1;
        System.out.println(Arrays.toString(array));
    }

    public static int[] arrayList2() {

        int[] array = new int[100];
        for (int i = 0, j = 0; i < array.length; i++, j += 1)
            array[i] = j;
        return array;
    }

    public static int[] changeArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
        return array;
    }

    public static void diagonalSquare(int size) {
        int[][] square = new int[size][size];
        for (int i = 0; i < size; i++) {
            square[i][i] = 1;
            square[i][size - i - 1] = 1;
        }
               for (int i = 0; i < size; i++)
            System.out.println(Arrays.toString(square[i]));
    }
    public static void lenArray (int len, int initialValue){
        int [] array = new int[len];
        for (int i = 0; i < array.length; i++)
        array[i] = initialValue;
        System.out.println(Arrays.toString(array));
    }
}



