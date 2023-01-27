package lesson4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lesson4.warriors.Commander;
import lesson4.warriors.Warrior;

public class Army<E extends Warrior> implements Iterable<E>{
    private List<E> army = new ArrayList<>();
    private Commander commander;

    public Army(Commander commander) {
        this.commander = commander;
        addCommander();
    }

    private void addCommander() {
        army.add((E)commander);
    }

    public void addWarriorInArmy(E e) {
        army.add(e);
    }

    @Override
    public Iterator<E> iterator() {
        return army.iterator();
    }
}
