package set.ordenacao;

public class Produto implements Comparable<Produto>{
   
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;
    
   
    public Produto(int codigo, String nome, double preco, int quantidade) {
      
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "{" + nome + ", " + preco + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    @Override
    public int compareTo(Produto p) {
      return this.nome.compareToIgnoreCase(p.getNome());
    }

}
