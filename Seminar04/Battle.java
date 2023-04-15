package JAVA_OOP.Seminar04;

@SuppressWarnings("rawtypes")
public class Battle {
    private Fighter personage1;
    private Fighter personage2;

    public Battle(Fighter personage1, Fighter personage2) {
        this.personage1 = personage1;
        this.personage2 = personage2;
    }

    public Fighter battle() {
        System.out.println(personage1.getName() + " vs " + personage2.getName());
        while (true) {
            int danage = personage1.dealingDamage();
            personage2.reduceHP(danage);
            System.out.println(personage1.getName() + " наносит урон " + danage + ", у " + personage2.getName()
                    + " осталось " + personage2.getHp() + " здоровья");
            if (!personage2.isAlive()) {
                System.out.println(personage2.getName() + " умер");
                System.out.print("Победитель:");
                return personage1;
            }
            danage = personage2.dealingDamage();
            personage1.reduceHP(danage);
            System.out.println(personage2.getName() + " наносит урон " + danage + ", у " + personage1.getName()
                    + " осталось " + personage1.getHp() + " здоровья");
            if (!personage1.isAlive()) {
                System.out.println(personage1.getName() + " умер");
                System.out.print("Победитель:");
                return personage2;
            }
        }
    }
}