package actividad1;

public class LinkedList<T> {
    private Node<T> head;
    private final boolean isDoubly;
    private final boolean isCircular;

    public LinkedList(boolean isDoubly, boolean isCircular) {
        this.isDoubly = isDoubly;
        this.isCircular = isCircular;
        this.head = null;
    }

    // Insertar al final
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            if (isCircular) head.setNext(head);
            return;
        }

        Node<T> current = head;
        if (isCircular) {
            while (current.getNext() != head) {
                current = current.getNext();
            }
            current.setNext(newNode);
            newNode.setNext(head);
            if (isDoubly) {
                newNode.setPrev(current);
                head.setPrev(newNode);
            }
        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
            if (isDoubly) newNode.setPrev(current);
        }
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
