package Strategy.strategy;

public class ContextMath {

    private StrategyMath strategy;

    public ContextMath(StrategyMath strategy) {
        this.strategy = strategy;
    }

    public int calcular(int num1, int num2){
        return strategy.operacao(num1, num2);
    }


}
