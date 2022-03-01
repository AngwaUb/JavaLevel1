/**
 * Java Level1 Lesson7
 *
 * @author IrinaK
 * @version 01.03.2022
 */
public class HomeWorkApp7 {
    private static Cats[] cats = {
            new Cats("Гарфилд", 17),
            new Cats("Матроскин", 22),
            new Cats("Василий", 18),
            new Cats("Леопольд", 27)
    };
    private static Plate plate = new Plate(55);

    public static void main(String[] args) {
        System.out.println(plate);
        feedCats();
        printCats();
        System.out.println(plate);
        System.out.println("Добавим корм...");
        plate.addFeed(40);
        System.out.println(plate);
        feedCats();
        printCats();
        System.out.println(plate);
    }

    private static void feedCats() {
        for (Cats elem : cats) {
            elem.eat(plate);
        }
    }

    private static void printCats() {
        for (Cats elem : cats) {
            System.out.println(elem);
        }
    }
}

class Cats {
    private String name;
    private int appetite;
    private boolean fullness = false;

    Cats(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plateVar) {
        if (!fullness) {
            fullness = plateVar.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return name + (fullness ? " сытый" : " голодный");
    }
}

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (n <= food) {
            food -= n;
            return true;
        } else {
            return false;
        }
    }

    public void addFeed(int addithion) {
        food += addithion;
    }

    @Override
    public String toString() {
        return "На тарелке " + food + " единиц корма";
    }
}
