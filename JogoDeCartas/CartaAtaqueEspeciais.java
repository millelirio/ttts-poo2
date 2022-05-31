package JogoDeCartas;

public class CartaAtaqueEspeciais extends CartaAtaque{
    protected String efeitos;

    public CartaAtaqueEspeciais(String nome, TipoDeCarta tipoDeCarta, int preço, String poder, int resistencia, String efeitos) {
        super(nome, tipoDeCarta, preço, poder, resistencia);
        this.efeitos = efeitos;
    }

    protected String verEfeitos(){
        return efeitos;
    }


}
