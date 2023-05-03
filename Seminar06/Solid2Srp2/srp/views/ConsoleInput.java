package JAVA_OOP.Seminar06.Solid2Srp2.srp.views;

import java.util.Scanner;

import JAVA_OOP.Seminar06.Solid2Srp2.srp.models.Order;

public class ConsoleInput {
    public Order inputFromConsole() {
        Order order = new Order(prompt("Client name: "),
                prompt("Product: "),
                Integer.parseInt(prompt("Quantity: ")),
                Integer.parseInt(prompt("Price: ")));
        return order;
    }

    Scanner in = new Scanner(System.in);

    private String prompt(String message) {
        System.out.print(message);
        return in.nextLine();
    }
}