package lesson2.allAnimals;

import lesson2.Animal;
import lesson2.interfaces.Runable;
import lesson2.interfaces.Swimable;

public class Crocodile extends Animal implements Swimable, Runable{

    public Crocodile(String name, int numberOfPaws, String color) {
        super(name, numberOfPaws, color);
    }

    @Override
    public String toString() {
        return "Крокодил:" + super.toString() + String.format("\n  -Скорость бега: %s км/ч\n  -Скорость плавания: %s км/ч", speedOfRun(), speedOfSwim());
    }

    @Override
    public int speedOfSwim() {
        return 29;
    }

    @Override
    public int speedOfRun() {
        return 48;
    }
}
