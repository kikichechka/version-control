package lesson4.weapons;
public class Sword extends Weapon {

    public Sword(int maximumDamage) {
        super(maximumDamage);
    }

    @Override
    public String toString() {
        return String.format("Удар мечом (максимальная сила удара %d кг.) в %d кг.", maximumDamage,
                this.doTheDamage());
    }
}
