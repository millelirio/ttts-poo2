package SistemaDeLivraria;

 abstract class Produto {
    protected String nome;
    protected static int contador=0;
    protected int id;
    protected float preco;
    protected int quantidade;
    protected String indicacao;

    public Produto() {
        ++contador;
        this.id = contador;
    }

    public Produto(String nome, float preco, int quantidade, String indicacao) {
        this();
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.indicacao = indicacao;
    }

     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public float getPreco() {
         return preco;
     }

     public void setPreco(float preco) {
         this.preco = preco;
     }

     public float getQuantidade() {
         return quantidade;
     }

     public void setQuantidade(int quantidade) {
         this.quantidade = quantidade;
     }

     public String getIndicacao() {
         return indicacao;
     }

     public void setIndicacao(String indicacao) {
         this.indicacao = indicacao;
     }

     @Override
     public String toString() {
         return "Nome:" + nome + " - id: " + id +" - quantidade:" + quantidade;
     }
 }
