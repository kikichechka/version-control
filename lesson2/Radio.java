package lesson2;
import lesson2.interfaces.Speakable;

public class Radio implements Speakable{

    @Override
    public String speak() {
        return "\nРадио: Добро пожаловать в наш зоопарк! Звуки всех живатных:";
    }
}
