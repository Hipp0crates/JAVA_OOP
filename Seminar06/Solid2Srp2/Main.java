package JAVA_OOP.Seminar06.Solid2Srp2;

import JAVA_OOP.Seminar06.Solid2Srp2.srp.models.Order;;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();
        order.saveToJson();
    }
}