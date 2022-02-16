import java.util.Arrays;
import java.util.Random;

/**
 * GeekBrainsJavaHomeWork3
 *
 * @author IrinaK
 * @version 16.02.2022
 */
public class HomeWorkApp3 {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1:");
        doArrayInverse();

        System.out.println("\nЗадание 2:");
        doArrayFilling();

        System.out.println("\nЗадание 3:");
        doArrayModify();

        System.out.println("\nЗадание 4:");
        doSquareArray();

        System.out.println("\nЗадание 5:");
        System.out.println(Arrays.toString(createArray(14, 15)));

        System.out.println("\nЗадание 6*:");
        findMinMaxInArray();

        System.out.println();
        System.out.println("\nЗадание 7**:");
        int[] arr1 = {11, 12, 13, 16, 20}; // {11, 12, 13 ||| 16, 20}
        System.out.println(Arrays.toString(arr1));
        System.out.println(checkArrayBalance(arr1));
        int[] arr2 = {11, 12, 13, 16, 23}; // баланса нет
        System.out.println(Arrays.toString(arr2));
        System.out.println(checkArrayBalance(arr2));

        System.out.println("\nЗадача 8***:");
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr3));
        shiftArray(arr3, 2);
        System.out.println("<<< 2");
        System.out.println(Arrays.toString(arr3));
        shiftArray(arr3, -3);
        System.out.println(">>> 3");
        System.out.println(Arrays.toString(arr3));
    }

    static void doArrayInverse() {
        int[] arr = {0, 1, 0, 0, 1, 1, 1, 0};

        System.out.println("Исходный массив:\n" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
        System.out.println("Измененный массив:\n" + Arrays.toString(arr));
    }

    static void doArrayFilling() {
        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void doArrayModify() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Исходный массив:\n" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println("Измененный массив:\n" + Arrays.toString(arr));
    }

    static void doSquareArray() {
        int[][] matrix = new int[7][7];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - 1 - i] = 1;
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    static void findMinMaxInArray() {
        final int SIZE_ARR = 20;
        final int VALUE_MAX = 100;

        int[] arr = new int[SIZE_ARR];
        Random rnd = new Random();

        int min = VALUE_MAX;
        int max = 0;

        for (int i = 0; i < SIZE_ARR; i++) {
            arr[i] = rnd.nextInt(VALUE_MAX);
        }

        for (int i = 0; i < SIZE_ARR; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.printf("Минимальное значение: %s, Максимальное значение: %d", min, max);
    }

    static boolean checkArrayBalance(int[] arr) {
        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }

        if (sum % 2 != 0) {
            return false;
        }

        int halfSum = sum / 2;
        sum = 0;
        for (int elem : arr) {
            sum += elem;
            if (sum == halfSum) {
                return true;
            }
        }
        return false;
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return (a > 0) ? a : -a;
        return gcd(b, a % b);
    }

    static void shiftArray(int[] arr, int n) {
        int repeat = gcd(arr.length, n);
        int stepCount = arr.length / repeat - 1;
        for (int i = 0; i < repeat; i++) {
            int currPos = i;
            int backup = arr[currPos];
            for (int j = 0; j < stepCount; j++) {
                int nextPos = (currPos + n + arr.length) % arr.length;
                arr[currPos] = arr[nextPos];
                currPos = nextPos;
            }
            arr[currPos] = backup;
        }
    }
}


