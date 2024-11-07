package Factory.notas;

public class NotaTrabalho extends Nota{

    public NotaTrabalho(double valor) {
        super(valor);
    }

    @Override
    public String getType() {
        return "Trabalho";
    }
}
