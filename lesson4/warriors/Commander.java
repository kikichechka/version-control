package lesson4.warriors;

public class Commander extends Warrior {

    public Commander(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Командир: %s", super.getName());
    }
}
