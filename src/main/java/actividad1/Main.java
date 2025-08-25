package actividad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seleccion = -1;

        // === PRIMER PROMPT: seleccionar ejemplo o lista ===
        while (true) {
            System.out.println("Selecciona una opcion inicial:");
            System.out.println("1. Ejemplo enteros");
            System.out.println("2. Ejemplo strings");
            System.out.println("3. Ejemplo contactos");
            System.out.println("4. Crear tu propia lista");
            System.out.print("Opcion: ");

            try {
                seleccion = sc.nextInt();
                if (seleccion >= 1 && seleccion <= 4) break;
                else System.out.println("Opción invalida. Intenta de nuevo.");
            } catch (Exception e) {
                System.out.println("Entrada invalida. Ingresa un número.");
                sc.next(); // limpiar buffer
            }
        }
        sc.nextLine(); // limpiar enter

        // === MANEJO DE EJEMPLOS ===
        if (seleccion == 1) {
            DataTypeExamples.ejemploEnteros();
            return;
        } else if (seleccion == 2) {
            DataTypeExamples.ejemploStrings();
            return;
        } else if (seleccion == 3) {
            DataTypeExamples.ejemploContactos();
            return;
        }

        // === SEGUNDO PROMPT: tipo de lista ===
        int tipo = -1;
        while (true) {
            System.out.println("Selecciona el tipo de lista:");
            System.out.println("1. Simple");
            System.out.println("2. Doble");
            System.out.println("3. Circular");
            System.out.print("Opcion: ");

            try {
                tipo = sc.nextInt();
                if (tipo >= 1 && tipo <= 3) break;
                else System.out.println("Opción invalida. Intenta de nuevo.");
            } catch (Exception e) {
                System.out.println("Entrada invalida. Ingresa un número.");
                sc.next();
            }
        }
        sc.nextLine(); // limpiar enter

        boolean isDoubly = (tipo == 2);
        boolean isCircular = (tipo == 3);

        LinkedList<String> lista = new LinkedList<>(isDoubly, isCircular);

        // === MENÚ PRINCIPAL ===
        int opcion = 0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insertar");
            System.out.println("2. Eliminar");
            System.out.println("3. Buscar");
            System.out.println("4. Mostrar");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            try {
                opcion = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada invalida. Ingresa un número.");
                sc.next();
                continue;
            }
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Dato a insertar: ");
                    lista.add(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Dato a eliminar: ");
                    lista.remove(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Dato a buscar: ");
                    System.out.println(lista.search(sc.nextLine()) ? "Encontrado" : "No encontrado");
                    break;
                case 4:
                    lista.display();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion inválida.");
                    break;
            }

            if (opcion != 0) {
                System.out.print("Presiona ENTER para continuar...");
                sc.nextLine();
            }
        } while (opcion != 0);

        sc.close();
    }
}
