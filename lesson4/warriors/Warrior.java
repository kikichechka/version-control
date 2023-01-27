package lesson4.warriors;
import lesson4.interfaces.Weaponable;

public abstract class Warrior {
    private String name;
    private Weaponable weapon;
    private int health;

    public Warrior(String name) {
        this.name = name;
        this.health = 500;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }
    
    public int getHealth() {
        return health;
    }

    public Weaponable getWeapon() {
        return weapon;
    } 

    @Override
    public String toString() {
        return " ~ Воин: ";
    }
}
