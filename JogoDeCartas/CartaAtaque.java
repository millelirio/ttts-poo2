package JogoDeCartas;

public class CartaAtaque  extends Carta {

    protected String poder;
    protected int resistencia;

    public CartaAtaque(String nome, TipoDeCarta tipoDeCarta, int preço, String poder, int resistencia) {
        super(nome, tipoDeCarta, preço);
        this.poder = poder;
        this.resistencia = resistencia;

    }




    @Override
    String verNome() {
        return nome;
    }

    @Override
    TipoDeCarta verTipo() {
        return tipoDeCarta;
    }

    @Override
    int verCusto() {
        return preço;
    }
}



