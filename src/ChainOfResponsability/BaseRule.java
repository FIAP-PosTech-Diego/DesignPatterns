package ChainOfResponsability;

public abstract class BaseRule {
    protected BaseRule nextRule;

    public void setNextHandler(BaseRule baseRule){
        this.nextRule = baseRule;
    }

    public abstract void check(double grade);
}
