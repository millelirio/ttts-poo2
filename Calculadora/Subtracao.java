package Calculadora;

public class Subtracao implements Calculo{
    protected float numero1;
    protected float numero2;
    protected  float subtracao;


    public Subtracao(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.subtracao= subtracao;

    }

    @Override
    public float pegarValor() {

        this.subtracao = numero1 - numero2;
        return subtracao;
    }


    @Override
    public String resultadoCalculo() {
        return "Subtração:  " +numero1 + " - " + numero2 + " = " + subtracao ;

    }
}
