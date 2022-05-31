package JogoDeCartas;

abstract class Carta {
    protected String nome;
    protected TipoDeCarta tipoDeCarta;
    protected int preço;

    public Carta(String nome, TipoDeCarta tipoDeCarta, int preço) {
        this.nome = nome;
        this.tipoDeCarta = tipoDeCarta;
        this.preço = preço;
    }

    abstract String verNome();
    abstract TipoDeCarta verTipo();
    abstract int verCusto();
}
