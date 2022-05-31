package JogoDeCartas;

public interface ITabuleiro {
    void inserirDeck();
    void verificarCarta(Carta[] cartas);
    void verificarVencedor();
}
