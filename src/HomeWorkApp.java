public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = -300;
        int b = 303;
        int c = a + b;
        System.out.println(c >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor() {
        int value = 20;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 7, b = 9;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
