package actividad1;

public class DataTypeExamples {
    public static void ejemploEnteros() {
        LinkedList<Integer> lista = new LinkedList<>(false, false);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println("Lista de enteros:");
        lista.display();
    }

    public static void ejemploStrings() {
        LinkedList<String> lista = new LinkedList<>(false, false);
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("Java");
        System.out.println("Lista de Strings:");
        lista.display();
    }

    public static void ejemploContactos() {
        LinkedList<Contacto> lista = new LinkedList<>(true, false);
        lista.add(new Contacto("Juan", "Calle 123", "555-1111"));
        lista.add(new Contacto("Ana", "Av. Central", "555-2222"));
        lista.add(new Contacto("Luis", "Boulevard", "555-3333"));
        System.out.println("Lista de contactos:");
        lista.display();
    }
}