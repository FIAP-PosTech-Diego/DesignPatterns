package Decorator;

import java.math.BigDecimal;

public class CalculoPrecoComum implements CalculoPreco{
    @Override
    public BigDecimal valorFinal(Produto produto) {

        BigDecimal imposto = new BigDecimal("0.10");
        BigDecimal valorFinal = produto.getValorUnitario().add(produto.getValorUnitario().multiply(imposto));

        return valorFinal;


    }
}
