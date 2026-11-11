package TALLER16.EJERCICIO3;

public class Main {
    public static void main(String[] args) {
        Mensajero mensajero = new Mensajero();
        String mensaje = "Tu código de verificación es: 458920";

        // Envío por Email
        mensajero.enviarMensaje(new CanalEmail(), mensaje, "usuario@email.com");

        // Envío por SMS
        mensajero.enviarMensaje(new CanalSMS(), mensaje, "+573001234567");

        // Envío por Notificación Push
        mensajero.enviarMensaje(new CanalPush(), mensaje, "Device_Token_9988");
    }
}