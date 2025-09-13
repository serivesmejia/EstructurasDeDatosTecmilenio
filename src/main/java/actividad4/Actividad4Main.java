package actividad4;

public class Actividad4Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        // Insertar nodos
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);

        // Mostrar recorridos
        System.out.println("Recorrido INORDEN:");
        arbol.inorden();

        System.out.println("\nRecorrido PREORDEN:");
        arbol.preorden();

        System.out.println("\nRecorrido POSTORDEN:");
        arbol.postorden();

        // Búsquedas
        System.out.println("\n\n¿Existe 40? " + arbol.buscar(40));
        System.out.println("¿Existe 100? " + arbol.buscar(100));
    }
}
