package avanceproj;

// Clase Task
class Task {
    private String descripcion;
    private Department departamento;

    public Task(String descripcion, Department departamento) {
        this.descripcion = descripcion;
        this.departamento = departamento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Department getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "[Depto: " + departamento + "] " + descripcion;
    }
}