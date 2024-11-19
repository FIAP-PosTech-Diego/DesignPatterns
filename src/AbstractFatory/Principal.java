package AbstractFatory;

import AbstractFatory.NFE.NFE;
import AbstractFatory.boleto.Boleto;
import AbstractFatory.loja.LojaCentroDaInformatica;
import AbstractFatory.venda.Venda;
import AbstractFatory.venda.VendaFactory;

import java.math.BigDecimal;

public class Principal {


    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setNome("Smartphone Moto x");
        produto.setQuantidade(1);
        produto.setValorUnitario(BigDecimal.valueOf(1000));

        VendaFactory factory = new LojaCentroDaInformatica();

        Venda venda = new Venda(factory);

        venda.realizarVenda(produto);

    }
}
