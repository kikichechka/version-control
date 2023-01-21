package lesson3.lecture;

public class User implements Comparable<User>{
    private String name;
    private String surname;
    private int age;
    private Person subordinates = new Person();

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public Person getSubordinates() {
        return subordinates;
    }
    public void setSubordinates(Person subordinates) {
        this.subordinates = subordinates;
    }

    @Override
    public String toString() {
        String result = String.format("Пользователь: \n   Имя: %s\n   Фамилия: %s\n   Возраст: %d", getName(), getSurname(), getAge());
        for (User user : subordinates) {
            result = result + String.format("\nБосс: %s: \n%s.", getName(), user.toString());
        }
        return result;
    }

    @Override
    public int compareTo(User other) {

        int name = this.getName().compareTo(other.getName());
        if (name != 0) {
            return name;
        }

        int surname = this.getSurname().compareTo(other.getSurname());
        if (surname != 0) {
            return surname;
        }

        return this.getAge() - other.getAge();
    }

    public void addSubordinates(Person person) {
        setSubordinates(person);
    }

    public void addOneUser(User user) {
        subordinates.addUser(user);
    }
}
