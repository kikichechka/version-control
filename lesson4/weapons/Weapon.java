package lesson4.weapons;
import java.util.Random;

import lesson4.interfaces.Weaponable;

public abstract class Weapon implements Weaponable{
    protected int maximumDamage; // максимальный урон

    public Weapon(int maximumDamage) {
        this.maximumDamage = maximumDamage;
    }

    @Override
    public int doTheDamage() {
        return new Random().nextInt(0, maximumDamage);
    }
}
