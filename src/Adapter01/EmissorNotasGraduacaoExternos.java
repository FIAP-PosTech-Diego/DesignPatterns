package Adapter01;

public class EmissorNotasGraduacaoExternos {

    private int score;

    public EmissorNotasGraduacaoExternos(int score){
        this.score = score;
    }

    public int getNota(){
        return score;
    }

    public String getNotaDescricao(){
        System.out.println("EXECUTANDO REGRAS DE NOTA GRADUACAO");

        if(score >= 90) return "A";
        else if(score >= 80) return "B";
        else if(score >= 70) return "C";
        else if(score >= 60) return "D";
        else return "F";

    }


}
