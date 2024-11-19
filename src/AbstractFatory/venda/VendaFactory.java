package AbstractFatory.venda;

import AbstractFatory.NFE.NFE;
import AbstractFatory.boleto.Boleto;

public interface VendaFactory {

    NFE criaNEF();

    Boleto criaBoleto();
}
