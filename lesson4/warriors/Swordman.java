package lesson4.warriors;
import lesson4.weapons.Sword;

public class Swordman extends Warrior {
    private Sword sword;

    public Swordman(String name, Sword sword) {
        super(name);
        this.sword = sword;
    }

    public Sword getSword() {
        return sword;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Меченосец %s, количество здоровья %d, вооружен мечом.", super.getName(), super.getHealth());
    }
}
