package lesson2;

public abstract class Animal{
    private String name;
    private int numberOfPaws;
    private String color;

    public Animal(String name, int numberOfPaws, String color) {
        this.name = name;
        this.numberOfPaws = numberOfPaws;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public int getNumberOfPaws() {
        return numberOfPaws;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
            return String.format("\n  -Кличка: %s\n  -Цвет: %s\n  -Количество лап: %s", getName(), getColor(), getNumberOfPaws());
    }
}
