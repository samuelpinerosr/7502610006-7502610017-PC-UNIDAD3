package TALLER16.EJERCICIO3;

// Canal de Email
class CanalEmail extends CanalMensaje {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando Email a [" + destinatario + "]: " + mensaje);
    }
}