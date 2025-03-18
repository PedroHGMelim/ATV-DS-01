package ATVDS01;

public class Produto {    
    private String nome;
    private float preco;
    private int cod;
    private int estoque;
    private String validade;

    public Produto(){

    }

    public Produto(String nome, float preco, int cod, int estoque, String validade){
        this.nome = nome;
        this.preco = preco;
        this.cod = cod;
        this.estoque = estoque;
        this.validade = validade;
    }

    public Produto(String nome, String validade, int cod, int estoque, float preco){
        this.nome = nome;
        this.validade = validade;
        this.cod = cod;
        this.estoque = estoque;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toLowerCase();
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String todosDados() {
        return "Nome do produto: "+nome+
               "\nPreço do produto: R$"+preco+
               "\nCódigo do produto: "+cod+
               "\nQuantidade de "+nome+" no estoque: "+estoque+
               "\nData de validade do produto: "+validade;
    }
    
}