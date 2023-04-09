package JAVA_OOP.Seminar03HW;

public class Element {
    Object data;
    private Element next;
    private Element previous;

    public Element(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Element getNext() {
        return next;
    }

    // vscode ругается на private, так что просто убрал public
    void setNext(Element element) {
        next = element;
    }

    // vscode ругается на private, так что просто убрал public
    void setPrevious(Element element) {
        previous = element;
    }

    public Element getPrevious() {
        return previous;
    }
}