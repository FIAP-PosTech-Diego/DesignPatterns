package Strategy;

import Strategy.strategy.ContextMath;
import Strategy.strategy.operacoes.Somar;
import Strategy.strategy.operacoes.Subtratir;

public class Principal {

    public static void main(String[] args) {

        ContextMath math = new ContextMath(new Somar());

        int calcular = math.calcular(1, 2);


        System.out.println(calcular);


        math = new ContextMath(new Subtratir());

        int calcular1 = math.calcular(10, 2);

        System.out.println(calcular1);

    }
}
