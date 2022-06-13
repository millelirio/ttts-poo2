package SistemaDeLivraria;

import java.text.ParseException;

abstract class ProdutoAdulto extends Produto {
    boolean ProdutoAdulto;

    public ProdutoAdulto(boolean produtoAdulto) {
        ProdutoAdulto = produtoAdulto;
    }

    void pedirDadosComprador(Produto produto) throws ParseException {
        Pessoa comprador = new Pessoa("Millena","545454554", "5454", "09/12/1997");
    }

    public boolean isProdutoAdulto() {

        return ProdutoAdulto;
    }

    public void setProdutoAdulto(boolean produtoAdulto) {
        ProdutoAdulto = produtoAdulto;
    }
}
