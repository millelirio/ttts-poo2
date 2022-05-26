package Calculadora;

public class Soma implements Calculo{
    protected float numero1;
    protected float numero2;
    protected  float soma;


    public Soma(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;

        this.soma = soma;

    }

    @Override
    public float pegarValor() {

        this.soma = numero1 +numero2;
        return soma;
    }


    @Override
    public String resultadoCalculo() {
        return "Calculadora.Soma:  " +numero1 + " + " + numero2 + " = " + soma ;

    }

}

