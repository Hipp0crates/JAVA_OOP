package JAVA_OOP.Seminar06.Solid5Lsp2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import JAVA_OOP.Seminar06.Solid5Lsp2.lsp.Orderable;

public class OrderCalculator implements Iterable<Orderable> {
    private List<Orderable> orders = new ArrayList<>();

    public void add(Orderable order) {
        orders.add(order);
    }

    public int calcAmount() {
        int sum = 0;
        for (Orderable order : orders) {
            sum += order.getAmount();
        }
        return sum;
    }

    @Override
    public Iterator<Orderable> iterator() {
        return orders.iterator();
    }
}