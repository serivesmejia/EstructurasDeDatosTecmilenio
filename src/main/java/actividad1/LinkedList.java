package actividad1;

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private final boolean isDoubly;
    private final boolean isCircular;

    public LinkedList(boolean isDoubly, boolean isCircular) {
        this.isDoubly = isDoubly;
        this.isCircular = isCircular;
        this.head = null;
        this.tail = null;
    }

    // Insertar al inicio
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            if (isCircular) {
                head.setNext(head);
                if (isDoubly) head.setPrev(head);
            }
        } else {
            newNode.setNext(head);
            if (isDoubly) head.setPrev(newNode);
            head = newNode;
            if (isCircular) {
                tail.setNext(head);
                if (isDoubly) head.setPrev(tail);
            }
        }
    }

    // Insertar al final (ya la tenías, pero ahora actualizamos tail)
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            if (isCircular) {
                head.setNext(head);
                if (isDoubly) head.setPrev(head);
            }
            return;
        }

        if (isCircular) {
            tail.setNext(newNode);
            newNode.setNext(head);
            if (isDoubly) {
                newNode.setPrev(tail);
                head.setPrev(newNode);
            }
            tail = newNode;
        } else {
            tail.setNext(newNode);
            if (isDoubly) newNode.setPrev(tail);
            tail = newNode;
        }
    }

    // Eliminar del inicio
    public T removeFirst() {
        if (head == null) return null;
        T data = head.getData();

        if (head == tail) { // Un solo nodo
            head = null;
            tail = null;
            return data;
        }

        head = head.getNext();
        if (isCircular) {
            tail.setNext(head);
        }
        if (isDoubly && head != null) head.setPrev(null);
        return data;
    }

    // Eliminar del final
    public T removeLast() {
        if (head == null) return null;
        T data = tail.getData();

        if (head == tail) { // Un solo nodo
            head = null;
            tail = null;
            return data;
        }

        if (!isDoubly) {
            Node<T> current = head;
            while (current.getNext() != tail) {
                current = current.getNext();
            }
            tail = current;
            tail.setNext(isCircular ? head : null);
        } else {
            tail = tail.getPrev();
            if (tail != null) tail.setNext(isCircular ? head : null);
        }

        return data;
    }

    // Ver el primero
    public T peekFirst() {
        return (head != null) ? head.getData() : null;
    }

    // Ver el último
    public T peekLast() {
        return (tail != null) ? tail.getData() : null;
    }

    // Eliminar un nodo
    public void remove(T data) {
        if (head == null) return;

        Node<T> temp = head;

        // Si es la cabeza
        if (temp.getData().equals(data)) {
            if (isCircular && head.getNext() == head) {
                head = null;
                return;
            }
            if (isCircular) {
                Node<T> last = head;
                while (last.getNext() != head) {
                    last = last.getNext();
                }
                head = head.getNext();
                last.setNext(head);
                if (isDoubly) head.setPrev(last);
            } else {
                head = head.getNext();
                if (isDoubly && head != null) head.setPrev(null);
            }
            return;
        }

        while (temp.getNext() != null && !temp.getNext().getData().equals(data)) {
            if (isCircular && temp.getNext() == head) return;
            temp = temp.getNext();
        }

        if (temp.getNext() == null || (isCircular && temp.getNext() == head)) return;

        Node<T> toDelete = temp.getNext();
        temp.setNext(toDelete.getNext());
        if (isDoubly && toDelete.getNext() != null) {
            toDelete.getNext().setPrev(temp);
        }
    }

    // Buscar
    public boolean search(T data) {
        if (head == null) return false;
        Node<T> current = head;
        do {
            if (current.getData().equals(data)) return true;
            current = current.getNext();
        } while (current != null && (!isCircular || current != head));
        return false;
    }

    // Mostrar
    public void display() {
        if (head == null) {
            System.out.println("Lista vacia.");
            return;
        }
        Node<T> current = head;
        do {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        } while (current != null && (isCircular ? current != head : true));
        System.out.println(isCircular ? "(circular)" : "null");
    }
}
