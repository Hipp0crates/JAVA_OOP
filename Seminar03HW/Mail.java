package JAVA_OOP.Seminar03HW;

public class Mail {
    public static void main(String[] args) {
        LinkedSet example = new LinkedSet();
        example.add("Один");
        example.add("Два");
        example.add(1, 3);
        LinkedSet.show(example);
        System.out.println("Размер листа: " + example.size());

        System.out.println();
        example.remove(1);
        LinkedSet.show(example);
        System.out.println("Размер листа: " + example.size());

        System.out.println();
        System.out.println(example.get(0));
        System.out.println(example.get(5));
    }
}