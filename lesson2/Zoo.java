package lesson2;

import java.util.ArrayList;
import java.util.List;

import lesson2.interfaces.Runable;
import lesson2.interfaces.Speakable;


public class Zoo {
    private List<Animal> zoo;
    private Radio radio = new Radio();
    ;

    public Zoo() {
        this.zoo = new ArrayList<Animal>();
    }

    public List<Animal> getZoo() {
        return zoo;
    }

    public Radio getRadio() {
        return radio;
    }

    public List <Speakable> getSpeakable() {
        List<Speakable> answer = new ArrayList<>();
        answer.add(getRadio());
        for (Animal animal : zoo) {
            if (animal instanceof Speakable) {
                answer.add((Speakable)animal);
            }
        }
        return answer;
    }

    public List <Runable> getRunable() {
        List<Runable> answer = new ArrayList<>();
        for (Animal animal : zoo) {
            if (animal instanceof Runable) {
                answer.add((Runable)animal);
            }
        }
        return answer;
    }

    public String getChampionOfAnimails() {
        int max = 0;
        for (Runable animal : getRunable()) {
            if (animal.speedOfRun() > max) {
                max = animal.speedOfRun();
            }
        }
        return String.format("Максимальная скорость бега среди зверей составляет %s км/ч.", max);
    }

    public Zoo addAnimal(Animal animal) {
        zoo.add(animal);
        return this;
    }

    
}
