package ChainOfResponsability;

public class RevisorRule extends BaseRule{

    @Override
    public void check(double grade) {
        if (grade >= 70 && grade < 90){
            System.out.println("Nota: " + grade + " aprovada automaticamente");
        }else if(nextRule != null){
            nextRule.check(grade);
        }
    }
}
