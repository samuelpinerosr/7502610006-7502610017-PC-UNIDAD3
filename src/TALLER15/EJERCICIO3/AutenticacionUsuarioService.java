package TALLER15.EJERCICIO3;

public class AutenticacionUsuarioService {
    public boolean autenticar(Usuario usuario, String nombreIngresado, String contrasenaIngresada) {
        return usuario.getNombreUsuario().equals(nombreIngresado)
                && usuario.getContrasena().equals(contrasenaIngresada);
    }
}