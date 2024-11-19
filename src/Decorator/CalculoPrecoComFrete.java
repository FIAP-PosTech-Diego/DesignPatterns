package Decorator;

import java.math.BigDecimal;

public class CalculoPrecoComFrete implements CalculoPreco{

    private CalculoPreco calculo;

    public CalculoPrecoComFrete(CalculoPreco calculo) {
        this.calculo = calculo;
    }

    @Override
    public BigDecimal valorFinal(Produto produto) {

        BigDecimal valorFinal = calculo.valorFinal(produto);

        BigDecimal frete;

        if(produto.getQuantidade() > 3){
            frete = BigDecimal.valueOf(11);
            valorFinal = valorFinal.add(frete);
        }else{
            frete = BigDecimal.valueOf(17);
            valorFinal = valorFinal.add(frete);
        }

        return valorFinal;
    }
}
