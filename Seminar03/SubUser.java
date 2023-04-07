package JAVA_OOP.Seminar03;

public class SubUser extends User {
    private int lvl;

    public SubUser(User user, int lvl) {
        super(user.getName(), user.getAge());
        this.lvl = lvl;
    }

    @Override
    public String toString() {
        // Добавляем пробелы при выводе сотрудников в зависимости от иерархии
        String lvl = String.format(("%" + this.lvl + "s"), " ");
        return String.format("%s %s", lvl, super.toString());
    }
}