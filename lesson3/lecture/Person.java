package lesson3.lecture;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Person implements Iterable <User>{
    private List <User> listUsers = new ArrayList<>();

    public List<User> getListUsers() {
        return listUsers;
    }

    public void addUser(User user) {
        getListUsers().add(user);
    }

    private class UserIterator implements Iterator<User> {
        private int index = 0;

            @Override
            public boolean hasNext() {
                return getListUsers().size() > index;
            }
            @Override
            public User next() {
                return getListUsers().get(index++);
            }
    }
    @Override
    public Iterator<User> iterator() {

        return new UserIterator();
    }

}
