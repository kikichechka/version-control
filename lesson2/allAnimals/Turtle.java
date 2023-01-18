package lesson2.allAnimals;

import lesson2.Animal;

public class Turtle extends Animal{

    public Turtle(String name, int numberOfPaws, String color) {
        super(name, numberOfPaws, color);
    }

    @Override
    public String toString() {
        return "Черепашка:" + super.toString();
    }
}
