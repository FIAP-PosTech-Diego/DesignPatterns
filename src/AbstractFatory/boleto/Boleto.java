package AbstractFatory.boleto;

import AbstractFatory.Produto;

public interface Boleto {

    void emitir(Produto produto, double imposto);

}
