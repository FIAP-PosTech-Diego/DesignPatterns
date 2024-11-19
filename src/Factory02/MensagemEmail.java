package Factory02;

public class MensagemEmail implements Mensagem{
    @Override
    public void enviar(String mensagem) {
        System.out.println("email: " + mensagem);

    }
}
