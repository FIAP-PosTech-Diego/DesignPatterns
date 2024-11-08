package ChainOfResponsability;

public class Main {

    public static void main(String[] args) {

        //CriaRules
        BaseRule aprovadorAutomativoRule = new AprovadorAutomaticoRule();
        BaseRule revisorRule = new RevisorRule();
        BaseRule rejeicaoRule = new RejeicaoRule();

        //Configurar cadeia de responsabilidades
        aprovadorAutomativoRule.setNextHandler(revisorRule);
        revisorRule.setNextHandler(rejeicaoRule);

//        Processar diferentes notas
        double[] grades = {95, 85, 65};

        for(double grade : grades){
            aprovadorAutomativoRule.check(grade);
        }

        System.out.println("FIM !!!");



    }

}
