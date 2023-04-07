package JAVA_OOP.Seminar03;

public class User implements Comparable<User> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Personal subordinates = new Personal();

    public Personal getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(Personal subordinates) {
        this.subordinates = subordinates;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Сотрудник: ").append(name).append(", возраст: ").append(age);
        return res.toString();
    }

    @Override
    public int compareTo(User o) {
        int compareName = this.name.compareTo(o.name);
        if (compareName == 0) {
            return this.age - o.age;
        }
        return compareName;
    }
}