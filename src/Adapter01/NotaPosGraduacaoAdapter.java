package Adapter01;

public class NotaPosGraduacaoAdapter implements Nota{
    private EmissorNotasPosGraduacaoExternos emissorNotasPosGraduacaoExternos;

    public NotaPosGraduacaoAdapter(EmissorNotasPosGraduacaoExternos externalGradePosGraduacao) {
        this.emissorNotasPosGraduacaoExternos = externalGradePosGraduacao;

    }

    @Override
    public double getValue() {
        return emissorNotasPosGraduacaoExternos.getNota();
    }

    @Override
    public String getTipoNota() {
        return emissorNotasPosGraduacaoExternos.getNotaDescricao();
    }
}
