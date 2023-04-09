package JAVA_OOP.Seminar03HW;

import java.util.Iterator;

public class LinkedSet implements Iterable<Object> {
    private Element start;
    private Element end;
    private int count = 0;

    @Override
    public Iterator<Object> iterator() {
        return new Iterator<Object>() {
            // Нулевой элемент со значением null
            Element element0 = new Element(null);
            {
                element0.setNext(start);
            }
            Element currentElement = element0;

            @Override
            public boolean hasNext() {
                return currentElement.getNext() != null;
            }

            @Override
            public Object next() {
                currentElement = currentElement.getNext();
                return currentElement.getData();
            }
        };
    }

    // Получение размера листа
    public int size() {
        return count;
    }

    public Element getElement(int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        Element result = start;
        for (int i = 1; i <= index; i++) {
            result = result.getNext();
        }
        return result;
    }

    // Получение значения по индексу
    public Object get(int index) {
        if (index < size()) {
            Element element = getElement(index);
            System.out.print("Значение элемента с индексом " + index + ": ");
            return element.getData();
        } else {
            System.out.print("Нет элемента с индексом: ");
        }
        return index;
    }

    // Удаление по индексу
    public void remove(int index) {
        Element currentElement = getElement(index);
        Element nextElement = currentElement.getNext();
        Element previousElement = currentElement.getPrevious();
        if (index == 0) {
            start = nextElement;
            if (end == currentElement) {
                end = null;
            }
        }
        if (index == count - 1) {
            end = previousElement;
            if (start == currentElement) {
                start = null;
            }
        }
        count--;
        if (nextElement != null) {
            nextElement.setPrevious(previousElement);
        }
        if (previousElement != null) {
            previousElement.setNext(nextElement);
        }
        System.out.println("Удален элемент с индексом: " + index);
    }

    // Добавление по индексу
    public void add(int index, Object data) {
        if (count == index) {
            add(data);
            return;
        }
        count++;
        Element currentElement = new Element(data);
        if (index == 0) {
            start = currentElement;
        }
        Element nextElement = getElement(index);
        Element previousElement = nextElement.getPrevious();
        currentElement.setNext(nextElement);
        currentElement.setPrevious(previousElement);
        if (previousElement != null) {
            previousElement.setNext(currentElement);
        }
    }

    // Добавление в конец (перегрузка метода)
    public void add(Object data) {
        count++;
        Element element = new Element(data);
        if (start == null) {
            start = element;
            end = element;
            return;
        } else if (end == null) {
            end = element;
            return;
        }
        end.setNext(element);
        element.setPrevious(end);
        end = element;
    }

    // Вывод сета (листа)
    public static void show(LinkedSet list) {
        System.out.println("LinkedList: ");
        int index = 0;
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(index + ": " + element);
            index++;
        }
    }
}