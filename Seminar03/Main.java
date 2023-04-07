package JAVA_OOP.Seminar03;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Отдел менеджеров
        Personal managers = new Personal();
        managers.add(new User("Иван", 20))
                .add(new User("Вася", 32))
                .add(new User("Лена", 24))
                .add(new User("Иван", 21))
                .add(new User("Вася", 42))
                .add(new User("Лена", 21));
        System.out.println(managers);
        // Компаратор по name и age
        List<User> compareManagers = managers.toList();
        Collections.sort(compareManagers);
        show(compareManagers);
        User chiefManager = new User("Пётр", 52);
        chiefManager.setSubordinates(managers);

        // Отдел логистики (альтернативный способ добавления)
        User chiefLogistic = new User("Паша", 42);
        chiefLogistic.setSubordinates(new Personal().add(new User("Коля", 44))
                .add(new User("Галя", 29)));
        System.out.println(chiefLogistic.getSubordinates());

        // Начальнеги
        Personal chiefs = new Personal();
        chiefs.add(chiefManager)
                .add(chiefLogistic);

        // Главнюк
        User boss = new User("Анна", 50);
        boss.setSubordinates(chiefs);

        System.out.println(chiefs);
        System.out.println(boss);

        // Компания с иерархией
        System.out.println("\nКомпания");
        Company firma = new Company(boss);
        for (User item : firma) {
            System.out.println(item);
        }
    }

    public static void show(List<User> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}