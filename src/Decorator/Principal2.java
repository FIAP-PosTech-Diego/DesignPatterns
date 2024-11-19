package Decorator;

import java.math.BigDecimal;

public class Principal2 {

    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setNome("Smartphone Moto x");
        produto.setQuantidade(1);
        produto.setValorUnitario(BigDecimal.valueOf(40));

//        CalculoPreco calculo = new CalculoPrecoComBrinde(new CalculoPrecoComFrete(new CalculoPrecoComum()));
        CalculoPreco calculo = new CalculoPrecoComBrinde(new CalculoPrecoComum());

        BigDecimal preco = calculo.valorFinal(produto);

        System.out.println(preco.doubleValue());

    }

}
