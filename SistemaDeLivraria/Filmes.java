package SistemaDeLivraria;

import java.util.ArrayList;

public class Filmes extends Produto{
    String estudio;
    ArrayList<String> diretores;
    String genero;
    ArrayList<String> produtores;

    public Filmes(String nome, float preco, int quantidade, String indicacao, String estudio, ArrayList<String> diretores, String genero, ArrayList<String> produtores) {
        super(nome, preco, quantidade, indicacao);
        this.estudio = estudio;
        this.diretores = diretores;
        this.genero = genero;
        this.produtores = produtores;
    }

    @Override
    public String toString() {
        return "Nome:" + nome + " - id: " + id +" - quantidade:" + quantidade + " - Estúdio: " + estudio + " - Diretores: " + diretores +
                " - Genêro: " + genero + " - Produtores: " + produtores ;
    }
}
