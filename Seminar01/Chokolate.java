package JAVA_OOP.Seminar01;

public class Chokolate extends Product {
    private String taste;

    public Chokolate(String name, double price, int value, String taste) {
        super(name, price, value);
        this.taste = taste;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("шоколад со вкусом " + taste + " ").append(super.toString());
        return res.toString();
    }
}