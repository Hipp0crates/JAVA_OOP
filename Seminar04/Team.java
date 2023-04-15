package JAVA_OOP.Seminar04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Personage> implements Iterable<T> {
    List<T> personages = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
        return personages.iterator();
    }

    public Team<T> add(T personage) {
        this.personages.add(personage);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Группа:\n");
        for (T item : this) {
            res.append(item).append("\n");
        }
        res.append("Максимальная дальность группы: ").append(maxRange());
        return res.toString();
    }

    public int maxRange() {
        int max = 0;
        for (T item : this) {
            if (item instanceof Archer) {
                Archer archer = (Archer) item;
                if (archer.range() > max) {
                    max = archer.range();
                }
            }
        }
        return max;
    }
}