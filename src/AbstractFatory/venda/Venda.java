package AbstractFatory.venda;

import AbstractFatory.NFE.NFE;
import AbstractFatory.Produto;
import AbstractFatory.boleto.Boleto;

public class Venda {

    private NFE notaFiscal;

    private Boleto boleto;

    public Venda(VendaFactory vendaFactory){

        this.notaFiscal = vendaFactory.criaNEF();
        this.boleto = vendaFactory.criaBoleto();

    }

    public void realizarVenda(Produto produto){
        double imposto = notaFiscal.calcularImposto(produto);
        boleto.emitir(produto, imposto);
    }

}
