package lesson4.warriors;

import lesson4.weapons.Mace;

public class Militia extends Warrior {
    private Mace mace;

    public Militia(String name, Mace mace) {
        super(name);
        this.mace = mace;
    }

    public Mace getMace() {
        return mace;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Ополченец %s, количество здоровья %d, вооружен булавой.", super.getName(), super.getHealth());
    }

}
