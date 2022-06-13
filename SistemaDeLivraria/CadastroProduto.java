package SistemaDeLivraria;

import java.util.ArrayList;


public class CadastroProduto implements IGerenciadorProduto {
    ArrayList<Produto> listaDeProdutos;

    public CadastroProduto(ArrayList<Produto> listaDeProdutos) {
        this.listaDeProdutos = new ArrayList<>();
    }

    @Override
    public void adicionarProduto(Produto produto) {
        if(!verificarProduto(produto)){
            listaDeProdutos.add(produto);
        } else {
            for(Produto produtoNoEstoque : listaDeProdutos){
                if (produto.getNome().equals(produtoNoEstoque.getNome())){
                    produtoNoEstoque.setQuantidade((int) (produtoNoEstoque.getQuantidade() + produto.quantidade));
                    System.out.println("Produto já existe! \n Atualizado a quantidade no estoque");
                }

            }
        }
    }

    @Override
    public void verProduto(int id) {
        for(Produto produtoCadastrado : listaDeProdutos){
            if(produtoCadastrado.getId() == id){
                if (verificarProduto(produtoCadastrado)){
                    System.out.println(produtoCadastrado.toString());
                }
            }
        }

    }

    @Override
    public void atualizarProduto(int id, int quantidade) {
        for(Produto produtoCadastrado : listaDeProdutos){
            if(produtoCadastrado.getId() == id){
                if (verificarProduto(produtoCadastrado)){
                    produtoCadastrado.setQuantidade((int) (produtoCadastrado.getQuantidade() + quantidade));
                }
            }
        }
    }

    @Override
    public void removerProduto(int id, int quantidade) {
        for (Produto produtoCadastrado : listaDeProdutos) {
            if (produtoCadastrado.getId() == id) {
                if (verificarProduto(produtoCadastrado)) {
                    produtoCadastrado.setQuantidade((int) (produtoCadastrado.getQuantidade() - quantidade));
                    System.out.println("Produto removido com sucesso!");
                }
             else {
                System.out.println("Produto não encontrado!");
            }
        }
    }}

    @Override
    public void listagemPorCategoria(int id) {
        for (Produto produtoCadastrado : listaDeProdutos) {
            if (produtoCadastrado.getId() == id) {
                if (verificarProduto(produtoCadastrado)) {
                    System.out.println(produtoCadastrado.toString());
                }

            }
        }
    }

    @Override
    public void listagemCompleta() {
        System.out.println("\t \t xxxx Estoque xxxx");
        for(Produto produtoCadastrado : listaDeProdutos){

            System.out.println(produtoCadastrado.toString());
        }

    }

    @Override
    public void verQuantidadeDeProduto(int id) {

        for (Produto produtoCadastrado : listaDeProdutos) {
            if (produtoCadastrado.getId() == id) {
                if (verificarProduto(produtoCadastrado)) {
                    System.out.println("Quantidade de" + produtoCadastrado.getNome() + " : " + produtoCadastrado.getQuantidade() + "unidades");
                }

            } else {
                System.out.println("Produto não encontrado!");
            }
        }

    }

    @Override
    public boolean verificarProduto(Produto produto) {
        boolean produtoExiste = false;
        for(Produto produtoNoEstoque : listaDeProdutos){
            if( produtoNoEstoque.getNome().equals(produto.getNome())){
                produtoExiste = true;
            }
        }
        return produtoExiste;
    }
    }

