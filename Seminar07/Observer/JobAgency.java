package JAVA_OOP.Seminar07.Observer;

import java.util.ArrayList;
import java.util.List;

// Реализация рассылки сообщений
public class JobAgency implements Publisher {

    // список наблюдателей
    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Разослать предложения
    @Override
    public void sendOffer(String nameCompany, int salary) {
        for (Observer observer : observers) {
            observer.receiveOffer(nameCompany, salary);
        }
    }
}