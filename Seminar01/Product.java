package JAVA_OOP.Seminar01;

public class Product {
    private String name;
    private double price;
    private int counter;

    public String getName() {
        return name;
    }

    // vscode ругается на private, так что просто убрал public
    void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean sellCounter() {
        this.counter--;
        return counter > 0;
    }

    public Product(String name, double price, int value) {
        this.name = name;
        this.price = price;
        counter = value;
    }

    @Override
    public String toString() {
        return String.format("%s, %.2f р., остаток %s", name, price, counter);
    }
}