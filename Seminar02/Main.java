package JAVA_OOP.Seminar02;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.add(new Cow("Бурёнка"));
        zoo.add(new Bear("Потапыч", 59));
        zoo.add(new Platypus("Нос"));
        zoo.add(new Wolf("Серый"));
        zoo.add(new Goat("Маня"));
        zoo.add(new Bat("Микки"));
        zoo.add(new Flyingsquirrel("Чума"));
        zoo.add(new Bear("Косолап", 59));

        zoo.noise();
        System.out.println();
        zoo.show();
        System.out.println();
        System.out.println("Быстрейший бегун");
        System.out.println(zoo.fastestRun());
        System.out.println();
        System.out.println("Быстрейший летун");
        System.out.println(zoo.fastestFly());
    }
}