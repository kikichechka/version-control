package lesson4.weapons;

public class Bow extends Weapon {
    private int range;

    public Bow(int maximumDamage) {
        super(maximumDamage);
        this.range = super.maximumDamage;
    }

    @Override
    public String toString() {
        return String.format("Выстрел из лука (максимальная дальность стрельбы %d м.) на %d м.", maximumDamage,
                this.doTheDamage());
    }

    public int getRange() {
        return range;
    }

}
