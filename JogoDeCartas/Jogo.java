package JogoDeCartas;

import static JogoDeCartas.TipoDeCarta.ATAQUE;

public class Jogo {
    public static void main( String[] args) {

        Jogador jogador1 = new Jogador("Millena", 100, 50);
        Jogador jogador2 = new Jogador("Jupiter", 150, 70);
        CartaAtaque cartaAtaque = new CartaAtaque("Monstro", ATAQUE, 150, "Mágico", 200);
        //Tabuleiro Versus

        TabuleiroVersus tab1 = new TabuleiroVersus(jogador1, jogador2);
        tab1.inserirDeck();

        tab1.verificarVencedor();

}

}
