package Factory.notas;

public class NotaProva extends Nota{

    public NotaProva(double valor) {
        super(valor);
    }

    @Override
    public String getType() {
        return "Prova";
    }
}
