package JAVA_OOP.Seminar01;

public class Milk extends Product {
    public Milk(String name, double price, int value) {
        super(name, price, value);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("молоко ").append(super.toString());
        return res.toString();
    }
}