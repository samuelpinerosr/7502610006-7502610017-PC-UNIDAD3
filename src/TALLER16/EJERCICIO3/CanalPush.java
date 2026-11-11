package TALLER16.EJERCICIO3;

// Canal de Notificaciones Push (Extensión OCP)
class CanalPush extends CanalMensaje {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando Notificación Push a [" + destinatario + "]: " + mensaje);
    }
}
