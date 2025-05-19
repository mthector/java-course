package exercises.ventas;

public class Producto {
    private static int contadorProductos = 0;
    private int idProducto;
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.idProducto = ++contadorProductos;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
