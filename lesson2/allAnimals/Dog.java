package lesson2.allAnimals;

import lesson2.Animal;
import lesson2.interfaces.Runable;
import lesson2.interfaces.Speakable;

public class Dog extends Animal implements Runable, Speakable{

    public Dog(String name, int numberOfPaws, String color) {
        super(name, numberOfPaws, color);
    }

    @Override
    public String toString() {
        return "Собака:" + super.toString() + String
        .format("\n  -Говорит: %s\n  -Скорость бега: %s км/ч.", speak(), speedOfRun());
    }

    @Override
    public int speedOfRun() {
        return 10;
    }

    @Override
    public String speak() {
        return "Гав";
    }
}
