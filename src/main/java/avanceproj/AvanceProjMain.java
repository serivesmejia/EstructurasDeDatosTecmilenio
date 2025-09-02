package avanceproj;

import java.util.Scanner;

public class AvanceProjMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskSystem sistema = new TaskSystem();
        int opcion;

        do {
            System.out.println("\n===== SISTEMA DE GESTION DE TAREAS =====");
            System.out.println("1. Agregar tarea urgente (Pila)");
            System.out.println("2. Atender tarea urgente (Pop)");
            System.out.println("3. Ver proxima tarea urgente (Peek)");
            System.out.println("4. Agregar tarea regular (Cola)");
            System.out.println("5. Atender tarea regular (Dequeue)");
            System.out.println("6. Ver proxima tarea regular (Front)");
            System.out.println("7. Agregar tarea por departamento (Lista)");
            System.out.println("8. Buscar tarea por departamento");
            System.out.println("9. Eliminar tarea por departamento");
            System.out.println("10. Ver todas las tareas pendientes");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Descripción de la tarea urgente: ");
                    String desc = sc.nextLine();
                    Department depto = seleccionarDepartamento(sc);
                    sistema.agregarTareaPila(new Task(desc, depto));
                    System.out.println("Tarea urgente agregada.");
                }
                case 2 -> {
                    Task t = sistema.atenderTareaPila();
                    System.out.println(t == null ? "No hay tareas urgentes." : "Atendiendo: " + t);
                }
                case 3 -> {
                    Task t = sistema.verProximaPila();
                    System.out.println(t == null ? "No hay tareas urgentes." : "Próxima tarea: " + t);
                }
                case 4 -> {
                    System.out.print("Descripción de la tarea regular: ");
                    String desc = sc.nextLine();
                    Department depto = seleccionarDepartamento(sc);
                    sistema.agregarTareaCola(new Task(desc, depto));
                    System.out.println("Tarea regular agregada.");
                }
                case 5 -> {
                    Task t = sistema.atenderTareaCola();
                    System.out.println(t == null ? "No hay tareas regulares." : "Atendiendo: " + t);
                }
                case 6 -> {
                    Task t = sistema.verProximaCola();
                    System.out.println(t == null ? "No hay tareas regulares." : "Próxima tarea: " + t);
                }
                case 7 -> {
                    System.out.print("Descripción de la tarea: ");
                    String desc = sc.nextLine();
                    Department depto = seleccionarDepartamento(sc);
                    sistema.agregarTareaLista(new Task(desc, depto));
                    System.out.println("Tarea agregada a lista.");
                }
                case 8 -> {
                    Department depto = seleccionarDepartamento(sc);
                    Task[] tareas = sistema.buscarTareaLista(depto);
                    if (tareas.length == 0) {
                        System.out.println("No hay tareas para ese departamento.");
                    } else {
                        System.out.println("Tareas en el departamento " + depto + ":");
                        for (Task t : tareas) {
                            System.out.println("- " + t);
                        }
                    }
                }
                case 9 -> {
                    Department depto = seleccionarDepartamento(sc);
                    sistema.eliminarTareaLista(depto);
                    System.out.println("Tareas eliminadas del depto " + depto);
                }
                case 10 -> sistema.verTodasTareas();
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opcion inválida.");
            }
        } while (opcion != 0);
    }

    // Método auxiliar para elegir departamento
    private static Department seleccionarDepartamento(Scanner sc) {
        System.out.println("Selecciona departamento:");
        for (int i = 0; i < Department.values().length; i++) {
            System.out.println((i + 1) + ". " + Department.values()[i]);
        }
        int opcion;
        do {
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer
        } while (opcion < 1 || opcion > Department.values().length);
        return Department.values()[opcion - 1];
    }
}
