package Adapter01;

public class NotaGraduacaoAdapter implements Nota{

    private EmissorNotasGraduacaoExternos emissorNotasGraduacaoExternos;

    public NotaGraduacaoAdapter(EmissorNotasGraduacaoExternos externalGradeGraduacao) {
        this.emissorNotasGraduacaoExternos = externalGradeGraduacao;

    }

    @Override
    public double getValue() {
        return emissorNotasGraduacaoExternos.getNota();
    }

    @Override
    public String getTipoNota() {
        return emissorNotasGraduacaoExternos.getNotaDescricao();
    }
}
