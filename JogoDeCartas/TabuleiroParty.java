package JogoDeCartas;

public class TabuleiroParty implements ITabuleiro{
    protected static int countCartasAtaque =0;
    protected Jogador jogador1;
    protected Jogador jogador2;
    protected Jogador jogador3;
    protected Jogador jogador4;
    protected Jogador jogador5;



    @Override
     public void inserirDeck() {
        Deck[] deckJogador1 = new Deck[80];
        Deck[] deckJogador2 = new Deck[80];
        Deck[] deckJogador3 = new Deck[80];
        Deck[] deckJogador4 = new Deck[80];
        Deck[] deckJogador5 = new Deck[80];


    }

    @Override
    public void verificarCarta(Carta[] cartas) {
        for(int i=0; i < cartas.length; i++){
            if(cartas[i].tipoDeCarta.equals(TipoDeCarta.ATAQUE)){
                countCartasAtaque++;
                if(countCartasAtaque <= 35){
                    System.out.println("Carta pode ser jogada!");
                }
                else {
                    System.out.println("Carta não pode ser jogada pois ultrapassou o limite de 34 cartas de ataque no total no campo!");
                }

            }
        }


    }
    @Override
    public void verificarVencedor() {
        Jogador verificaJogador1 = this.jogador1;
        Jogador verificaJogador2 = this.jogador2;
        Jogador verificaJogador3 = this.jogador3;
        Jogador verificaJogador4 = this.jogador4;
        Jogador verificaJogador5 = this.jogador5;

        if(verificaJogador1.getVida() >0 && verificaJogador2.getVida() <=0 && verificaJogador3.getVida() <=0 && verificaJogador4.getVida() <=0 && verificaJogador5.getVida() <=0) {
            System.out.println("Jogador 1 é o vencedor!!");
        } if(verificaJogador1.getVida() <= 0 && verificaJogador2.getVida() > 0 && verificaJogador3.getVida() <=0 && verificaJogador4.getVida() <=0 && verificaJogador5.getVida() <=0){
            System.out.println("Jogador 2 é o vencedor!!");
        } if(verificaJogador1.getVida() <=0 && verificaJogador2.getVida() <=0 && verificaJogador3.getVida() >0 && verificaJogador4.getVida() <=0 && verificaJogador5.getVida() <=0){
            System.out.println("Jogador 3 é o vencedor!!");
        }
        if (verificaJogador1.getVida() <=0 && verificaJogador2.getVida() <=0 && verificaJogador3.getVida() <=0 && verificaJogador4.getVida() > 0 && verificaJogador5.getVida() <=0){
            System.out.println("Jogador 4 é o vencedor!!");
        }
        if (verificaJogador1.getVida() <=0 && verificaJogador2.getVida() <=0 && verificaJogador3.getVida() <=0 && verificaJogador4.getVida() <=0 && verificaJogador5.getVida() > 0){
            System.out.println("Jogador 5 é o vencendor!!");
        }
        if(verificaJogador1.getVida() <= 0 && verificaJogador2.getVida() <=0 && verificaJogador3.getVida() <=0 && verificaJogador4.getVida() <=0 && verificaJogador5.getVida() <=0){
            System.out.println("Empate!!");
        }

    }
}
