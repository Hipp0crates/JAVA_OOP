package JAVA_OOP.Seminar07HW;

public class Loger implements Logable {
    Log log;

    public Loger() {
        this.log = new Log();
    }

    @Override
    public void log(String comment) {
        log.add(comment);
    }

    public String show() {
        return log.out();
    }
}