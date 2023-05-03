package JAVA_OOP.Seminar06.Solid2Srp2;

import JAVA_OOP.Seminar06.Solid2Srp2.repository.JsonSaver;
import JAVA_OOP.Seminar06.Solid2Srp2.srp.models.Order;
import JAVA_OOP.Seminar06.Solid2Srp2.srp.views.ConsoleInput;;

public class Main {
    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        System.out.println("Введите заказ:");
        Order order = input.inputFromConsole();
        JsonSaver saver = new JsonSaver();
        saver.saveToJson(order);
    }
}