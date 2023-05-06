package JAVA_OOP.Seminar07.DecoratorFactory;

public class LogCalculator implements Calculable {
    Calculable calculable;
    Logable logable;

    public LogCalculator(Calculable calculable, Logable logable) {
        this.calculable = calculable;
        this.logable = logable;
        logable.log(String.format("Число %d\n", calculable.getResult()));
    }

    @Override
    public int getResult() {
        int res = calculable.getResult();
        logable.log(String.format("Получили %d\n", res));
        return res;
    }

    @Override
    public Calculable multi(int arg) {
        logable.log(String.format("Умножаем на %d\n", arg));
        return calculable.multi(arg);
    }

    @Override
    public Calculable sum(int arg) {
        logable.log(String.format("Прибавляем %d\n", arg));
        return calculable.sum(arg);
    }
}