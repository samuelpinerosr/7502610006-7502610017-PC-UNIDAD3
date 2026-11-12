package TALLER15.EJERCICIO3;

public class Usuario {
    private String nombreUsuario;
    private String correo;
    private String contrasena;

    public Usuario(String nombreUsuario, String correo, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }
}