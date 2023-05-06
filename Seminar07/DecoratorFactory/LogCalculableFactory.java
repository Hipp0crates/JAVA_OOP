package JAVA_OOP.Seminar07.DecoratorFactory;

public class LogCalculableFactory implements ICalculableFactory {
    Logable logable;

    public LogCalculableFactory(Logable logable) {
        this.logable = logable;
    }

    @Override
    public Calculable create(int primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logable);
    }
}