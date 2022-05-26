package Calculadora;

public class Multiplicacao implements Calculo{
    protected float numero1;
    protected float numero2;
    protected  float multiplicacao;


    public Multiplicacao(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;

        this.multiplicacao = multiplicacao;

    }

    @Override
    public float pegarValor() {

        this.multiplicacao = numero1 *numero2;
        return multiplicacao;
    }


    @Override
    public String resultadoCalculo() {
        return "Multiplicação:  " +numero1 + " * " + numero2 + " = " + multiplicacao ;

    }
}
