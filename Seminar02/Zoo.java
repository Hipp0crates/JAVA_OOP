package JAVA_OOP.Seminar02;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    private Radio radio = new Radio();

    public void add(Animal newAnimal) {
        this.animals.add(newAnimal);
    }

    public void show() {
        for (Animal item : this.animals)
            System.out.println(item);
    }

    public void noise() {
        for (Speakable item : noises()) {
            System.out.print(item.speak());
        }
        System.out.println();
    }

    private List<Speakable> noises() {
        List<Speakable> res = new ArrayList<>();
        for (Animal item : animals) {
            res.add(item);
        }
        res.add(radio);
        return res;
    }

    private List<Walkable> runners() {
        List<Walkable> res = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Walkable)
                res.add((Walkable) item);
        }
        return res;
    }

    private List<Flyable> flyers() {
        List<Flyable> res = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Flyable)
                res.add((Flyable) item);
        }
        return res;
    }

    private List<Floatable> swimmers() {
        List<Floatable> res = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Floatable)
                res.add((Floatable) item);
        }
        return res;
    }

    public Animal fastestRun() {
        List<Walkable> list = runners();
        Walkable champ = list.get(0);
        for (Walkable item : list) {
            if (champ.runSpeed() < item.runSpeed()) {
                champ = item;
            }
        }
        return (Animal) champ;
    }

    public Animal fastestFly() {
        List<Flyable> list = flyers();
        Flyable champ = list.get(0);
        for (Flyable item : list) {
            if (champ.flySpeed() < item.flySpeed()) {
                champ = item;
            }
        }
        return (Animal) champ;
    }

    public Animal fastestSwim() {
        List<Floatable> list = swimmers();
        Floatable champ = list.get(0);
        for (Floatable item : list) {
            if (champ.floatSpeed() < item.floatSpeed()) {
                champ = item;
            }
        }
        return (Animal) champ;
    }
}