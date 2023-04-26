package JAVA_OOP.Seminar04;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Thief> thiefs = new Team<>();
        archers.add(new Archer("Стрелок", 25, new Bow(20), new SmallShield()))
                .add(new Archer("Метатель", 20, new Bow(15), new SmallShield()));

        thiefs.add(new Thief("Негодяй", 40, new Knife(), new SmallShield()))
                .add(new Thief("Жулик", 30, new Knife(), new SmallShield()));
        System.out.println(archers);
        System.out.println(thiefs);

        Archer fighter1 = new Archer("Биба", 25, new Bow(20), new SmallShield());
        Archer fighter2 = new Archer("Боба", 25, new Bow(25), new SmallShield());
        System.out.println(new Battle(fighter1, fighter2).battle());
    }
}