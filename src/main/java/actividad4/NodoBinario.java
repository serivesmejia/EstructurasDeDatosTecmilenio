package actividad4;

class NodoBinario {
    int id;               // Identificador único (ej. ID de empleado)
    NodoBinario izquierda, derecha;

    public NodoBinario(int id) {
        this.id = id;
        this.izquierda = this.derecha = null;
    }
}
