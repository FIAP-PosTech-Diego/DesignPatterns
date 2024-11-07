package Factory;

import Factory.factories.NotaFactory;
import Factory.factories.NotaProvaFactory;
import Factory.factories.NotaTrabalhoFactory;
import Factory.notas.Nota;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<NotaFactory> notaFactories = Arrays.asList(new NotaProvaFactory(), new NotaTrabalhoFactory());


        for (NotaFactory notaFac : notaFactories){
            double notaRecebida = obterNota();
            Nota nota = notaFac.criarNota(notaRecebida);

            System.out.println("Tipo de nota: " + nota.getType() + ", valor: " + nota.getValor() );
        }


    }

    private static double obterNota() {

        return 0;
    }
}