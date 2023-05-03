package JAVA_OOP.Seminar06.Solid5Lsp2;

import JAVA_OOP.Seminar06.Solid5Lsp2.lsp.FactoryOrder;
import JAVA_OOP.Seminar06.Solid5Lsp2.lsp.Orderable;

public class Main {
    public static void main(String[] args) {
        FactoryOrder creator = new FactoryOrder();
        OrderCalculator calculator = new OrderCalculator();
        calculator.add(creator.create(3, 2, false));
        calculator.add(creator.create(1, 3, true));

        for (Orderable order : calculator) {
            System.out.println(order);
        }

        System.out.printf("Сумма заказа %d", calculator.calcAmount());
    }
}