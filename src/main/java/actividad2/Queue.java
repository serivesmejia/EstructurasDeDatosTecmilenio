package actividad2;

import actividad1.LinkedList;

public class Queue<T> {
    private LinkedList<T> lista = new LinkedList<>(false, false);

    public void enqueue(T data) {
        lista.add(data);
    }

    public T dequeue() {
        return lista.removeFirst();
    }

    public T peek() {
        return lista.peekFirst();
    }

    public boolean isEmpty() {
        return lista.peekFirst() == null;
    }
}