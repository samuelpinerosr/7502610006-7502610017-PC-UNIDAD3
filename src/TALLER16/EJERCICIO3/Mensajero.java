package TALLER16.EJERCICIO3;

// Clase Mensajero refactorizada (Cerrada a modificación)
class Mensajero {
    public void enviarMensaje(CanalMensaje canal, String mensaje, String destinatario) {
        canal.enviar(mensaje, destinatario);
    }
}