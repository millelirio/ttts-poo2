package SistemaDeLivraria;

public interface IGerenciadorProduto extends ICadastroProduto {
    void listagemPorCategoria(int id);
    void listagemCompleta();
    void verQuantidadeDeProduto(int id);
    boolean verificarProduto(Produto produto);

}
