package SistemaDeLivraria;

public class Livro extends Produto{
    protected String genero;
    protected String escritor;
    protected String editora;


    public Livro(String nome, float preco, int quantidade, String indicacao, String genero, String escritor, String editora) {
        super(nome, preco, quantidade, indicacao);
        this.genero = genero;
        this.escritor = escritor;
        this.editora = editora;
    }


    @Override
    public String toString() {
        return "Nome:" + nome + " - id: " + id +" - Quantidade:" + quantidade + " - Indicação: " + indicacao +" - Gênero: " + genero +
                " - Escritor: " + escritor + " - Editora: " + editora;
    }
}
