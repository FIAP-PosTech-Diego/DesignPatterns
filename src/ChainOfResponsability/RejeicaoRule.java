package ChainOfResponsability;

public class RejeicaoRule extends BaseRule{

    @Override
    public void check(double grade) {
        if (grade < 70){
            System.out.println("Nota: " + grade + " reprovada automaticamente");
        }else if(nextRule != null){
            nextRule.check(grade);
        }
    }
}
