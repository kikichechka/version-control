package lesson4.warriors;

import java.util.Random;

import lesson4.weapons.Bow;

public class Archer extends Warrior {
    private Bow bow;
    private int defeatDistance;

    public Archer(String name, Bow bow) {
        super(name);
        this.bow = bow;
        this.defeatDistance = new Random().nextInt(0, this.bow.doTheDamage());
    }

    public int getDefeatDistance() {
        return defeatDistance;
    }

    public Bow getBow() {
        return bow;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Лучник %s, количество здоровья %d, вооружен луком.", super.getName(), super.getHealth());
    }

}
