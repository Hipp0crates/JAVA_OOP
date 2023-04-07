package JAVA_OOP.Seminar03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<User> {
    User boss;

    public Company(User boss) {
        this.boss = boss;
    }

    List<SubUser> deepTree(User user, int lvl) {
        List<SubUser> res = new ArrayList<>();
        res.add(new SubUser(user, lvl));
        if (user.getSubordinates() == null || user.getSubordinates().size() == 0)
            return res;
        for (User item : user.getSubordinates()) {
            // Добавляем количество пробелов для отображения иерархии (минимум 1)
            res.addAll(deepTree(item, lvl + 2));
        }
        return res;
    }

    @Override
    public Iterator<User> iterator() {
        return new iterator2();
    }

    private class iterator2 implements Iterator<User> {
        // С нулевым lvl не будет работать вывод из SubUser
        List<SubUser> users = deepTree(boss, 1);
        Iterator<SubUser> count = users.iterator();

        @Override
        public boolean hasNext() {
            return count.hasNext();
        }

        @Override
        public User next() {
            return count.next();
        }
    }
}