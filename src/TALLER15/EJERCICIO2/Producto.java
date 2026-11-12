package TALLER15.EJERCICIO2;

public class Producto {
    private String codigo;
    private String nombre;
    private double precioBase;

    public Producto(String codigo, String nombre, double precioBase) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}