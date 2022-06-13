package SistemaDeLivraria;

import javax.sound.sampled.Port;
import java.util.ArrayList;

public class Livraria {
    public static void main( String[] args) {
        ArrayList<Produto> livros =new ArrayList<>();
        Produto livro1 = new Livro("Como eu era antes de você", 25, 2, "+10", "romance", "Jojo moyes", "Intrínseca");
        Produto livro2 = new Livro("O menino de pijama listrado", 31.40F, 4, "+18","Drama", "John Boyne" , "Seguinte");
        Produto livro3 = new Livro("Código limpo", 67.50F, 8, "Tecnologia", "+18","Robert C. Martin", "Atlas Books");
        Produto livro4 = new Livro("Como eu era antes de você", 25, 2, "+10","romance", "Jojo moyes", "Intrínseca");

        CadastroProduto cadastroLivros = new CadastroProduto(livros);
        Caixa caixa = new Caixa();

        cadastroLivros.adicionarProduto(livro1);
        cadastroLivros.adicionarProduto(livro2);
        cadastroLivros.adicionarProduto(livro3);
        cadastroLivros.adicionarProduto(livro4);
        caixa.compra(livro1);
        System.out.println(caixa.toString());


        cadastroLivros.listagemCompleta();
        cadastroLivros.removerProduto(1, 2);
        cadastroLivros.listagemCompleta();
    }
}
