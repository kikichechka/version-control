package lesson1;

public class DairyProduce extends Product {
    private Double fatPercentage;

    public DairyProduce(String name, int price, Double fatPercentage) {
        super(name, price);
        this.fatPercentage = fatPercentage;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", процент жирности %s %%.", getFatPercentage());
    }

    public Double getFatPercentage() {
        return fatPercentage;
    }
}
