package lesson2.allAnimals;
import lesson2.Animal;
import lesson2.interfaces.Runable;
import lesson2.interfaces.Speakable;

public class Cat extends Animal implements Runable, Speakable{

    public Cat(String name, int numberOfPaws, String color) {
        super(name, numberOfPaws, color);
    }

    @Override
    public String toString() {
        return "Котик:" + super.toString() + String
        .format("\n  -Говорит: %s\n  -Скорость бега: %s км/ч.", speak(), speedOfRun());
    }

    @Override
    public int speedOfRun() {
        return 5;
    }

    @Override
    public String speak() {
        return "Мяу";
    }
}
