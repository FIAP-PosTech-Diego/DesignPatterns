package Factory02;

public class MensagemSMS implements Mensagem{
    @Override
    public void enviar(String mensagem) {
        System.out.println("sms: " + mensagem);

    }
}
