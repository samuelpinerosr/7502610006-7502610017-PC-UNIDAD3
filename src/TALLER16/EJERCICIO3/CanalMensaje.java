package TALLER16.EJERCICIO3;

// Clase abstracta base para los canales de mensajería
abstract class CanalMensaje {
    public abstract void enviar(String mensaje, String destinatario);
}
