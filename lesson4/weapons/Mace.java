package lesson4.weapons;

public class Mace extends Weapon{

    public Mace(int maximumDamage) {
        super(maximumDamage);
    }

    @Override
    public String toString() {
        return String.format("Удар булавой (максимальная сила удара %d кг.) в %d кг.", maximumDamage,
                this.doTheDamage());
    }
}
