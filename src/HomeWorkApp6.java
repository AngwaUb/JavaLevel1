/**
 * Java Level1 Lesson6
 *
 * @author IrinaK
 * @version 26.02.2022
 */
class HomeWorkApp6 {
    public static void main(String[] args) {
        InAnimalAction[] animals = {
                new Cat("Гарфилд"),
                new Dog("Бобик"),
                new Dog("Шарик"),
                new Dog("Рекс"),
                new Dog("Гуфи"),
                new Cat("Леопольд")
        };

        int[] testData = {200, 2, 300, 59, 600, 9, 500, -3, 501, 10, 0, 11};
        int i = 0;
        for (InAnimalAction animal :
                animals) {
            System.out.println(animal.run(testData[i++]));
            System.out.println(animal.swim(testData[i++]));
            System.out.println("---------------");
        }

        int animalsCount = 0;
        int catsCount = 0;
        int dogsCount = 0;
        for (InAnimalAction animal :
                animals) {
            if (animal.getClass() == Cat.class) {
                animalsCount++;
                catsCount++;
            } else if (animal.getClass() == Dog.class) {
                animalsCount++;
                dogsCount++;
            }
        }
        System.out.println("Всего животных в массиве: " + animalsCount);
        System.out.println("Кошек в массиве: " + catsCount);
        System.out.println("Собак в массиве: " + dogsCount);
    }
}

interface InAnimalAction {
    String run(int distance);

    String swim(int distance);
}

abstract class Animal implements InAnimalAction {
    protected String name;
    protected int maxDistanceRun;
    protected int maxDistanceSwim;

    Animal(String name) {
        this.name = name;
    }

    public String run(int distance) {
        if (distance <= 0) {
            return distance + " - некорректное значение дистанции";
        } else if (distance > maxDistanceRun) {
            return name + " не смог преодолеть " + distance + "м: пробежал " + maxDistanceRun + "м и упал(";
        } else {
            return name + " успешно пробежал " + distance + "м";
        }
    }

    public String swim(int distance) {
        if (distance <= 0) {
            return distance + " - некорректное значение дистанции";
        } else if (distance > maxDistanceSwim) {
            return name + " не смог преодолеть " + distance + "м: проплыл " + maxDistanceSwim + "м и утонул(";
        } else {
            return name + " проплыл " + distance + "м";
        }
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
        maxDistanceRun = 200;
    }

    @Override
    public String swim(int distance) {
        return name + ", как и все коты, не умеет плавать";
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
        maxDistanceRun = 500;
        maxDistanceSwim = 10;
    }
}
