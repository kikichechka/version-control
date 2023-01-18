package lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.getProducts().add(new DairyProduce("Молоко", 56, 3.0));
        vendingMachine.getProducts().add(new DairyProduce("Кефир", 95, 1.5));
        vendingMachine.getProducts().add(new Sweets("Белочка", 700, "Оркла Брэндс Россия"));
        vendingMachine.getProducts().add(new MeatProducts("Сосиски Стародворские", 328, "свинина"));
        for (Product product: vendingMachine.getProducts()) {
            System.out.println(product);
        }

        System.out.println("\n" + vendingMachine.getProductByName("Белочка"));
        System.out.println(vendingMachine.getProductByPrice(328));
    }
}
