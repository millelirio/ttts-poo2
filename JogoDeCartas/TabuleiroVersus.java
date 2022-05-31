package JogoDeCartas;

public class TabuleiroVersus implements ITabuleiro{
    protected static int countCartasAtaque =0;
    protected static int countCartasAtaqueEspecial = 0;
    protected Jogador jogador1;
    protected Jogador jogador2;


    public TabuleiroVersus(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    @Override
    public void  inserirDeck() {
        Deck[] deckJogador1 = new Deck[50];
        Deck[] deckJogador2 = new Deck[50];

    }

    @Override
    public void verificarCarta(Carta[] cartas) {

        for(int i=0; i < cartas.length; i++){
            if(cartas[i].tipoDeCarta.equals(TipoDeCarta.ATAQUE)){
                countCartasAtaque++;
                if(countCartasAtaque <= 5){
                    System.out.println("Carta pode ser jogada!");
                }
                else {
                    System.out.println("Carta não pode ser jogada pois ultrapassou o limite de 5 cartas de ataque do lado do campo!");
                }
            } else if(cartas[i].tipoDeCarta.equals(TipoDeCarta.ATAQUE_ESPECIAL)){
                countCartasAtaqueEspecial++;
                if (countCartasAtaqueEspecial <= 2){
                    System.out.println("Carta pode ser jogada!");
                }else{
                    System.out.println("Carta não pode ser jogada pois ultrapassou o limite de 2 cartas de ataque especial do lado do campo");
                }
        }


        }

    }

    @Override
    public void verificarVencedor() {
        Jogador verificaJogador1 = this.jogador1;
        Jogador verificaJogador2 = this.jogador2;
        if(verificaJogador1.getVida() <=0 && verificaJogador2.getVida() >0){
            System.out.println("Jogador 2 é o vencedor!!");
        } else if(verificaJogador1.getVida() >0 && verificaJogador2.getVida() <=0){
            System.out.println("Jogador 1 é o vencedor");
        } else if(verificaJogador1.getVida() <=0 && verificaJogador2.getVida() <=0){
            System.out.println("Empate!!");
        }

    }
}
