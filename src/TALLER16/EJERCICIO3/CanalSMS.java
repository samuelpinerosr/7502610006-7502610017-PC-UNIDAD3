package TALLER16.EJERCICIO3;

// Canal de SMS (Extensión OCP)
class CanalSMS extends CanalMensaje {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando SMS a [" + destinatario + "]: " + mensaje);
    }
}