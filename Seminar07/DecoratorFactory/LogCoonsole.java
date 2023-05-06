package JAVA_OOP.Seminar07.DecoratorFactory;

import java.util.Date;

public class LogCoonsole implements Logable {
    @Override
    public void log(String message) {
        Date date = new Date();
        System.out.printf("%s\n%s", date.toString(), message);
    }
}