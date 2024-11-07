package Factory.factories;

import Factory.notas.Nota;
import Factory.notas.NotaProva;
import Factory.notas.NotaTrabalho;

public class NotaTrabalhoFactory extends NotaFactory{
    @Override
    public Nota criarNota(double value) {
        return new NotaTrabalho(value);
    }
}
