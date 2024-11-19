package Factory02;

public class Teste {

    public static void main(String[] args) {

        Mensagem mensagem = MensagemFactory.getMensagem(1);
        mensagem.enviar("OLA");
    }


}
