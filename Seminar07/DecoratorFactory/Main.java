package JAVA_OOP.Seminar07.DecoratorFactory;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new LogCoonsole());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}