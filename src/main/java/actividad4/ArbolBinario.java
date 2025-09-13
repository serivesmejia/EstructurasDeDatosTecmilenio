package actividad4;

public class ArbolBinario {
    NodoBinario raiz;

    public NodoBinario insertar(int id) {
        raiz = insertar(raiz, id);
        return raiz;
    }

    // Insertar recursivo directo
    public NodoBinario insertar(NodoBinario nodo, int id) {
        if (nodo == null) {
            return new NodoBinario(id);
        }
        if (id < nodo.id) {
            nodo.izquierda = insertar(nodo.izquierda, id);
        } else if (id > nodo.id) {
            nodo.derecha = insertar(nodo.derecha, id);
        }
        return nodo;
    }

    public boolean buscar(int id) {
        return buscar(raiz, id);
    }

    // Buscar recursivo directo
    public boolean buscar(NodoBinario nodo, int id) {
        if (nodo == null) return false;
        if (nodo.id == id) return true;
        if (id < nodo.id) return buscar(nodo.izquierda, id);
        else return buscar(nodo.derecha, id);
    }

    // Recorrido Inorden
    public void inorden(NodoBinario nodo) {
        if (nodo != null) {
            inorden(nodo.izquierda);
            System.out.print(nodo.id + " ");
            inorden(nodo.derecha);
        }
    }

    public void inorden() {
        inorden(raiz);
    }

    // Recorrido Preorden
    public void preorden(NodoBinario nodo) {
        if (nodo != null) {
            System.out.print(nodo.id + " ");
            preorden(nodo.izquierda);
            preorden(nodo.derecha);
        }
    }

    public void preorden() {
        preorden(raiz);
    }

    // Recorrido Postorden
    public void postorden(NodoBinario nodo) {
        if (nodo != null) {
            postorden(nodo.izquierda);
            postorden(nodo.derecha);
            System.out.print(nodo.id + " ");
        }
    }

    public void postorden() {
        postorden(raiz);
    }
}
