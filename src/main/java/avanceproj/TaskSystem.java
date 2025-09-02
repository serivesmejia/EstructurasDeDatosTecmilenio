package avanceproj;

import actividad1.LinkedList;
import actividad2.Queue;
import actividad2.Stack;

import java.util.ArrayList;
import java.util.List;

// Clase que maneja la lógica del sistema
class TaskSystem {

    private Stack<Task> pilaUrgentes = new Stack<>();
    private Queue<Task> colaRegulares = new Queue<>();
    private LinkedList<Task> listaDepartamentos = new LinkedList<>(false, false);

    // ==== MÉTODOS PARA PILA (Urgentes) ====
    public void agregarTareaPila(Task t) {
        pilaUrgentes.push(t);
    }

    public Task atenderTareaPila() {
        return pilaUrgentes.isEmpty() ? null : pilaUrgentes.pop();
    }

    public Task verProximaPila() {
        return pilaUrgentes.isEmpty() ? null : pilaUrgentes.peek();
    }

    // ==== MÉTODOS PARA COLA (Regulares) ====
    public void agregarTareaCola(Task t) {
        colaRegulares.enqueue(t);
    }

    public Task atenderTareaCola() {
        return colaRegulares.isEmpty() ? null : colaRegulares.dequeue();
    }

    public Task verProximaCola() {
        return colaRegulares.isEmpty() ? null : colaRegulares.peek();
    }

    // ==== MÉTODOS PARA LISTA (Departamentos) ====
    public void agregarTareaLista(Task t) {
        listaDepartamentos.add(t);
    }

    public Task[] buscarTareaLista(Department depto) {
        List<Task> resultado = new ArrayList<>();
        for (Task t : listaDepartamentos) {
            if (t.getDepartamento() == depto) {
                resultado.add(t);
            }
        }
        return resultado.toArray(new Task[0]);
    }

    public void eliminarTareaLista(Department depto) {
        Task[] tareas = buscarTareaLista(depto);
        for (Task t : tareas) {
            listaDepartamentos.remove(t);
        }
    }

    // ==== MÉTODO PARA VER TODAS LAS TAREAS ====
    public void verTodasTareas() {
        System.out.println("\n--- Tareas Urgentes (Pila) ---");
        for (Task t : pilaUrgentes) System.out.println(t);

        System.out.println("\n--- Tareas Regulares (Cola) ---");
        for (Task t : colaRegulares) System.out.println(t);

        System.out.println("\n--- Tareas por Departamento (Lista) ---");
        for (Task t : listaDepartamentos) System.out.println(t);
    }
}