package map.pesquisa;

public class Produto{

    private Integer codigo;
    private String nome;
    private int quantidade;
    private double preco;
    
    public Produto(Integer codigo, String nome, int quantidade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }
    
    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
    }
}
