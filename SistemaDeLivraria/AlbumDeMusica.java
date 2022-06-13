package SistemaDeLivraria;

import java.util.ArrayList;

public class AlbumDeMusica extends Produto{
    ArrayList<String> musicos;
    String genero;
    String selo;

    public AlbumDeMusica(String nome, float preco, int quantidade, String indicacao, ArrayList<String> musicos, String genero, String selo) {
        super(nome, preco, quantidade,indicacao);
        this.musicos = musicos;
        this.genero = genero;
        this.selo = selo;
    }

    @Override
    public String toString() {
        return "Nome:" + nome + " - id: " + id +" - quantidade:" + quantidade + " - Indicação: " + indicacao +" - Músicos=" + musicos +
                "- Genêro: " + genero +" - Selo: " + selo;
    }
}
