package lesson2;
import lesson2.allAnimals.Cat;
import lesson2.allAnimals.Dog;
import lesson2.allAnimals.Crocodile;
import lesson2.allAnimals.Duck;
import lesson2.allAnimals.Turtle;
import lesson2.interfaces.Runable;
import lesson2.interfaces.Speakable;

public class Main {
    public static Zoo zoo = new Zoo();
    public static void main(String[] args) {
        
        addAnimalsInZoo();
        getZoo();
        radioDeclareVoice();
        radioDeclareRun();
        radioDeclareChampion();

    }

    public static void addAnimalsInZoo() {
        zoo.addAnimal(new Cat("Барсик", 4, "Белый"))
        .addAnimal(new Dog("Шарик", 4, "Серый"))
        .addAnimal(new Duck("Кря", 2, "Коричневый"))
        .addAnimal(new Turtle("Тартила", 4, "Серый"))
        .addAnimal(new Crocodile("Зубастик", 4, "Зеленый"));
    }

    public static void getZoo() {
        for (Animal animal : zoo.getZoo()) {
            System.out.println(animal);
        }
    }

    public static void radioDeclareVoice() {
        for (Speakable speak : zoo.getSpeakable()) {
            System.out.print(" " + speak.speak() + ",");
        }
    }

    public static void radioDeclareRun() {
        System.out.print("\nНаши животные умеют бегать со скростью:");
        for (Runable run : zoo.getRunable()) {
            System.out.print(" " + run.speedOfRun() + ",");
        }
        System.out.print(" км/ч.");
    }

    public static void radioDeclareChampion() {
        System.out.println("\n" + zoo.getChampionOfAnimails());
    }
}
