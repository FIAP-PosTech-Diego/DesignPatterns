package AbstractFatory.boleto;

import AbstractFatory.Produto;

public class BoletoBancoDoBrasil implements Boleto{

    @Override
    public void emitir(Produto produto, double imposto) {

        System.out.println("Banco do Brasil");
        System.out.println();

    }
}
