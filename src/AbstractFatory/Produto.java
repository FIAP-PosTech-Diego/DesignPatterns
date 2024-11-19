package AbstractFatory;

import java.math.BigDecimal;

public class Produto {

    private String nome;

    private int quantidade;

    private BigDecimal valorUnitario;

    public double getValor(double imposto){

        BigDecimal valorTotal = valorUnitario.add(BigDecimal.valueOf(imposto));

        valorTotal = valorTotal.multiply(BigDecimal.valueOf(quantidade));

        return valorUnitario.doubleValue();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
