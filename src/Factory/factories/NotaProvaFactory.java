package Factory.factories;

import Factory.notas.Nota;
import Factory.notas.NotaProva;

public class NotaProvaFactory extends NotaFactory{
    @Override
    public Nota criarNota(double value) {
        return new NotaProva(value);
    }
}
