package lesson2.allAnimals;

import lesson2.Animal;
import lesson2.interfaces.Flyable;
import lesson2.interfaces.Runable;
import lesson2.interfaces.Speakable;

public class Duck extends Animal implements Runable, Speakable, Flyable {

    public Duck(String name, int numberOfPaws, String color) {
        super(name, numberOfPaws, color);
    }

    @Override
    public String toString() {
        return "Утка:" + super.toString() + String
        .format("\n  -Говорит: %s\n  -Скорость бега: %s км/ч\n  -Скорость полета: %s км/ч",
        speak(), speedOfRun(), speedOfFly());
    }

    @Override
    public int speedOfRun() {
        return 8;
    }

    @Override
    public String speak() {
        return "Кря";
    }

    @Override
    public int speedOfFly() {
        return 28;
    }
}
