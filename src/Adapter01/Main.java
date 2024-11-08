package Adapter01;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmissorNotasGraduacaoExternos externalGradeGraduacao = new EmissorNotasGraduacaoExternos(85);
        EmissorNotasPosGraduacaoExternos externalGradePosGraduacao = new EmissorNotasPosGraduacaoExternos(15);


        List<Nota> notas = Arrays.asList(new NotaGraduacaoAdapter(externalGradeGraduacao), new NotaPosGraduacaoAdapter(externalGradePosGraduacao) );

        for(Nota nota : notas){
            System.out.println("Nota: " + nota.getValue());
            System.out.println("Descricao da Nota: " + nota.getTipoNota());

        }

    }
}
