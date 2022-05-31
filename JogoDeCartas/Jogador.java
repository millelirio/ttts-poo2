package JogoDeCartas;

public class Jogador {
    protected String nome;
    protected int vida;
    protected int poder;

    public Jogador(String nome, int vida, int poder) {
        this.nome = nome;
        this.vida = vida;
        this.poder = poder;
    }

    public int getVida() {
        return vida;
    }
}
