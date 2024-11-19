package Strategy.strategy.operacoes;

import Strategy.strategy.StrategyMath;

public class Somar implements StrategyMath {
    @Override
    public int operacao(int num1, int num2) {
        return num1 + num2;
    }
}
