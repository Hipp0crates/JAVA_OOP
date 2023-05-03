package JAVA_OOP.Seminar06.Solid5Lsp2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import JAVA_OOP.Seminar06.Solid5Lsp2.lsp.Order;

public class OrderCalculator implements Iterable<Order> {
    private List<Order> orders = new ArrayList<>();

    public void add(Order order) {
        orders.add(order);
    }

    public int calcAmount() {
        int sum = 0;
        for (Order order : orders) {
            sum += order.getAmount();
        }
        return sum;
    }

    @Override
    public Iterator<Order> iterator() {
        return orders.iterator();
    }
}