package actividad1;

class Contacto {
    private String nombre;
    private String direccion;
    private String telefono;

    public Contacto(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "(" + nombre + " - " + direccion + " - " + telefono + ")";
    }
}