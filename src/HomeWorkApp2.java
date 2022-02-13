/**
 * Второе ДЗ
 * @author IrinaK
 * @version 12.02.2022
 */
public class HomeWorkApp2 {

    public static void main(String[] args) {
        System.out.println(checkSum10and20(5, -13));
        System.out.println(checkSum10and20(4, 13));

        printPosOrNeg(-3);
        printPosOrNeg(0);

        System.out.println(checkNumIsNegative(-13));
        System.out.println(checkNumIsNegative(13));

        printFewString("Хорошо живет на свете Винни-Пух!", 4);
        printFewString("Nothing", 0);

        System.out.println(checkLeapYear(2022));
        System.out.println(checkLeapYear(2000));
        System.out.println(checkLeapYear(2100));
        System.out.println(checkLeapYear(2024));
    }

    static boolean checkSum10and20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void printPosOrNeg(int x) {
        System.out.println(x < 0 ? "Число отрицательное" : "Число положительное");
    }

    static boolean checkNumIsNegative(int x) {
        return x < 0;
    }

    static void printFewString(String st, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(st);
        }
    }

    static boolean checkLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
}
