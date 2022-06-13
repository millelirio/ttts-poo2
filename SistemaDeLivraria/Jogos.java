package SistemaDeLivraria;

public class Jogos extends Produto{
   String distribuidora;
   String genero;
   String estudio;

    public Jogos(String nome, float preco, int quantidade, String indicacao, String distribuidora, String genero, String estudio) {
        super(nome, preco, quantidade,indicacao);
        this.distribuidora = distribuidora;
        this.genero = genero;
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return "Nome:" + nome + " - id: " + id + " - Indicação: " + indicacao +" - quantidade:" + quantidade+
                " - Distribuidora:" + distribuidora  + " - Genêro:" + genero + " - Estúdio: " + estudio;
    }
}
