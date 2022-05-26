package Calculadora;

public class Divisao implements Calculo{
    protected float numero1;
    protected float numero2;
    protected  float divisao;


    public Divisao(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;

        this.divisao = divisao;

    }

    @Override
    public float pegarValor() {
        this.divisao = numero1 / numero2;
        return divisao;

    }


    @Override
    public String resultadoCalculo() {
        if(!verificarSeEZero()){
            return "Calculadora.Divisao:  " +numero1 + " / " + numero2 + " = " + divisao ;
        }
        return "Não foi possível realizar a divisão pois o número 2 equivale a 0";

    }
    public boolean verificarSeEZero(){
        if(this.numero2 == 0){
            return true;
        }
        return false;
    }
}
