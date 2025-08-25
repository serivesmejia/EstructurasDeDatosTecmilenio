package actividad2;

import actividad1.LinkedList;

public class Stack<T> {
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
}
