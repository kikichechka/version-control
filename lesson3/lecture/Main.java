package lesson3.lecture;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Person personal = new Person();
        
        personal.addUser(new User("Екатерина", "Малая", 31));
        personal.addUser(new User("Арина", "Малая", 1));
        personal.addUser(new User("Никита", "Малый", 10));

        User userBigBoss = new User("Виталий", "Малый", 37);
        
        for (User user : personal) {
            System.out.println(user);
        }

        Collections.sort(personal.getListUsers());

        for (User user : personal) {
            System.out.println(user);
        }

        userBigBoss.addSubordinates(personal);
        System.out.println(userBigBoss);
    }
}
