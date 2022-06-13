package SistemaDeLivraria;

public class Caixa implements ICaixa {
    float dinheiroNoCaixa;

    public Caixa() {

    }
    public Caixa(float dinheiroNoCaixa) {
        this();
        this.dinheiroNoCaixa = dinheiroNoCaixa;
    }

    @Override
    public void compra(Produto produto) {
        this.dinheiroNoCaixa = this.dinheiroNoCaixa + produto.getPreco();
    }

    public float getDinheiroNoCaixa() {
        return dinheiroNoCaixa;
    }

    @Override
    public String toString() {
        return "Caixa - Dinheiro no caixa: " + dinheiroNoCaixa + " reais.";
    }


}
