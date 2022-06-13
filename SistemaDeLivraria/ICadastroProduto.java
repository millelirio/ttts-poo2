package SistemaDeLivraria;

public interface ICadastroProduto {
    void adicionarProduto(Produto produto);
    void verProduto(int id);
    void atualizarProduto(int id, int quantidade);
    void removerProduto(int id, int quantidade);
}
