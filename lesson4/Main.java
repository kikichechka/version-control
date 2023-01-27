package lesson4;
import lesson4.warriors.Archer;
import lesson4.warriors.Commander;
import lesson4.warriors.Militia;
import lesson4.warriors.Swordman;
import lesson4.warriors.Warrior;
import lesson4.weapons.Bow;
import lesson4.weapons.Mace;
import lesson4.weapons.Sword;

public class Main {
    public static void main(String[] args) {
        Army<Warrior> army1 = new Army<>(new Commander("Commander1"));
        army1.addWarriorInArmy(new Swordman("Hero1", new Sword(50)));
        army1.addWarriorInArmy(new Archer("Hero2", new Bow(200)));
        army1.addWarriorInArmy(new Militia("Hero3", new Mace(80)));

        Army<Warrior> army2 = new Army<>(new Commander("Commander2"));
        army2.addWarriorInArmy(new Swordman("Hero1", new Sword(150)));
        army2.addWarriorInArmy(new Archer("Hero2", new Bow(180)));
        army2.addWarriorInArmy(new Militia("Hero3", new Mace(900)));
        
        for (Warrior warrior : army1) {
            System.out.println(warrior);
        }
        for (Warrior warrior : army2) {
            System.out.println(warrior);
        }
    }
}
