package JAVA_OOP.Seminar03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personal implements Iterable<User> {
    private List<User> users = new ArrayList<>();

    public Personal add(User user) {
        users.add(user);
        return this;
    }

    public int size() {
        return this.users.size();
    }

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                if (counter < users.size())
                    return true;
                return false;
            }

            @Override
            public User next() {
                return users.get(counter++);
            }
        };
    }

    public List<User> toList() {
        List<User> users = new ArrayList<>();
        for (User item : this) {
            users.add(item);
        }
        return users;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (User item : this) {
            res.append(item).append("\n");
        }
        return res.toString();
    }
}