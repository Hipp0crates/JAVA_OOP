package JAVA_OOP.Seminar01;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();
    private Double money = 0.0;

    public VendingMachine add(Product product) {
        products.add(product);
        return this;
    }

    public Product search(String name) {
        for (Product item : products) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public void sell(String name) {
        Product target = search(name);
        try {
            if (!target.sellCounter()) {
                products.remove(target);
            }
            this.money += target.getPrice();
            System.out.println("Продано: " + target);
        } catch (Exception e) {
            System.out.println("Нет такого товара.");
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("\nСостояние автомата: %.2f р.\n", money));
        for (Product item : products) {
            res.append(item + "\n");
        }
        return res.toString();
    }
}