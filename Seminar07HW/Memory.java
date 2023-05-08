package JAVA_OOP.Seminar07HW;

import java.util.Stack;

public class Memory {
    Stack<Calculatable> memory;

    public Memory() {
        this.memory = new Stack<>();
    }

    public void to(Calculatable item) {
        this.memory.push(item);
    }

    public Calculatable from() {
        return this.memory.pop();
    }

    public Calculatable last() {
        return this.memory.lastElement();
    }
}