package AbstractFatory.loja;

import AbstractFatory.NFE.NFE;
import AbstractFatory.NFE.NFESaoPaulo;
import AbstractFatory.boleto.Boleto;
import AbstractFatory.boleto.BoletoBancoDoBrasil;
import AbstractFatory.venda.VendaFactory;

public class LojaCentroDaInformatica implements VendaFactory {
    @Override
    public NFE criaNEF() {

        NFE nfe = new NFESaoPaulo();

        return nfe;
    }

    @Override
    public Boleto criaBoleto() {

        Boleto boleto = new BoletoBancoDoBrasil();
        return boleto;
    }
}
