package lesson3.homework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList<E> implements Iterable<E>{
    private List<E> list = new ArrayList<>();

    private List<E> getList() {
        return list;
    }

    public void addToMyList(E e) {
        getList().add(e);
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return getList().size() > index;
            }

            @Override
            public E next() {
                return getList().get(index++);
            }

        };
    }
}


