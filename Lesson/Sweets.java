package Lesson;

public class Sweets extends Product{
    String manufacturer;

    public Sweets(String name, int price, String manufacturer) {
        super(name, price);
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" за кг., производитель \"%s\".", getManufacturer());
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
