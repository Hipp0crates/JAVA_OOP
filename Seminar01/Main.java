package JAVA_OOP.Seminar01;

public class Main {
    public static void main(String[] args) {
        VendingMachine mart = new VendingMachine();
        mart.add(new Product("хлеб", 35, 10))
                .add(new Milk("Село", 50, 2))
                .add(new Product("сыр", 100.2, 5))
                .add(new CondensedMilk("Коровка", 150, 1))
                .add(new Chokolate("Алёнка", 35.2, 3, "ореха"))
                .add(new Bar("Марс", 60, 4));
        System.out.println(mart);
        mart.sell("Коровка");
        mart.sell("Коровка");
        mart.sell("Село");
        mart.sell("Село");
        mart.sell("Село");
        mart.sell("Марс");
        mart.sell("хлеб");
        System.out.println(mart);
    }
}