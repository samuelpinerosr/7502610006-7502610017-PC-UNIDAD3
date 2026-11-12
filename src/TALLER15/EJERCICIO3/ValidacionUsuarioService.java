package TALLER15.EJERCICIO3;

public class ValidacionUsuarioService {
    public boolean validarCorreo(Usuario usuario) {
        return usuario.getCorreo() != null && usuario.getCorreo().contains("@");
    }

    public boolean validarContrasena(Usuario usuario) {
        return usuario.getContrasena() != null && usuario.getContrasena().length() >= 8;
    }

    public boolean esUsuarioValido(Usuario usuario) {
        return validarCorreo(usuario) && validarContrasena(usuario);
    }
}