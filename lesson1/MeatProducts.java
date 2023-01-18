package lesson1;

public class MeatProducts extends Product {
    private String composition;

    public String getComposition() {
        return composition;
    }

    public MeatProducts(String name, int price, String composition) {
        super(name, price);
        this.composition = composition;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" за кг., состав: %s.", getComposition());
    }
}
