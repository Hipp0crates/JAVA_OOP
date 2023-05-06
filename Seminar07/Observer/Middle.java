package JAVA_OOP.Seminar07.Observer;

public class Middle implements Observer {
    String name;

    public Middle(String name) {
        this.name = name;
    }

    int salary;

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (salary > 50 && salary > this.salary) {
            System.out.println(String.format("Middle %s: I need this work! (company, salary) = %s, %d", name,
                    nameCompany, salary));
            this.salary = salary;
        } else {
            System.out.println(String.format("Middle %s: I got better job! (company, salary) = %s, %d", name,
                    nameCompany, salary));
        }
    }
}
