package actividad2;

public class Actividad2Main {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE PILA ---");

        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        System.out.println("Tope pila: " + pila.peek()); // C
        System.out.println("Pop: " + pila.pop());        // C
        System.out.println("Nuevo tope: " + pila.peek()); // B

        System.out.println("--- PRUEBA DE COLA ---");

        Queue<Integer> cola = new Queue<>();
        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);
        System.out.println("Frente cola: " + cola.peek()); // 1
        System.out.println("Dequeue: " + cola.dequeue());  // 1
        System.out.println("Nuevo frente: " + cola.peek()); // 2
    }
}
