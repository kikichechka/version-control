package lesson3.homework;

public class Main {
    public static void main(String[] args) {
        
        MyList<Integer> myList = new MyList<>();
        myList.addToMyList(1);
        myList.addToMyList(49);
        myList.addToMyList(2);
        myList.addToMyList(25);
        myList.addToMyList(17);

        
        for (Integer integer : myList) {
            System.out.println(integer);
        }
    }
}
