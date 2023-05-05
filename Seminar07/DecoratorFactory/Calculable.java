package JAVA_OOP.Seminar07.DecoratorFactory;

public interface Calculable {
    Calculable sum(int arg);

    Calculable multi(int arg);

    int getResult();
}