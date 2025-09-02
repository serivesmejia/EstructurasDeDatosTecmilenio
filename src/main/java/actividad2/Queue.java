package actividad2;

import actividad1.LinkedList;

import java.util.Iterator;

public class Queue<T> implements Iterable<T>{
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

    @Override
    public Iterator<T> iterator() {
        return lista.iterator();
    }
}