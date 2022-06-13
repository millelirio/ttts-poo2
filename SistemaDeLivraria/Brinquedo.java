package SistemaDeLivraria;

public class Brinquedo extends Produto{
    String tipo;

    public Brinquedo(String nome, float preco, int quantidade, String indicacao, String tipo) {
        super(nome, preco, quantidade, indicacao);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Nome:" + nome + " - id: " + id +" - quantidade:" + quantidade + " - Indicação: " + indicacao + " - Tipo: " + tipo;
    }
}
