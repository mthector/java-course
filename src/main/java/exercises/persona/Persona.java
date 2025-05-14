package exercises.persona;

public class Persona {
    private String nombre;
    private String apellido;

    // Constructor con argumentos
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Métodos Get y Set para nombre
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos Get y Set para apellido
    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Método opcional para mostrar información
    public String getInformacionCompleta() {
        return this.nombre + " " + this.apellido;
    }
}
