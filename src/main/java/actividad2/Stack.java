package actividad2;

import actividad1.LinkedList;

import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
    private LinkedList<T> lista = new LinkedList<>(false, false);

    public void push(T data) {
        lista.addFirst(data);
    }

    public T pop() {
        return lista.removeFirst();
    }

    public T peek() {
        return lista.peekFirst();
    }

    public boolean isEmpty() {
        return lista.peekFirst() == null;
    }

    @Override
    public Iterator<T> iterator() {
        return lista.iterator();
    }
}
