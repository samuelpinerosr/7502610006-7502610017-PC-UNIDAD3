package TALLER15.EJERCICIO3;

public class PruebaUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("samuel_dev", "samuel@correo.com", "claveSegura123");

        ValidacionUsuarioService validacionService = new ValidacionUsuarioService();
        AutenticacionUsuarioService autenticacionService = new AutenticacionUsuarioService();

        if (validacionService.esUsuarioValido(usuario)) {
            System.out.println("Datos del usuario validados correctamente.");

            boolean acceso = autenticacionService.autenticar(usuario, "samuel_dev", "claveSegura123");
            System.out.println("Resultado de autenticación: " + (acceso ? "Acceso concedido" : "Credenciales incorrectas"));
        } else {
            System.out.println("Error: Los datos del usuario no cumplen con los requisitos.");
        }
    }
}