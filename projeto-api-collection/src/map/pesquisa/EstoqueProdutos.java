package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    
    private Map<Integer, Produto> mapProdutos;

    public EstoqueProdutos() {
        this.mapProdutos = new HashMap<>();
    }

    public void adicionarProduto(Integer codigo, String nome, int quantidade, double preco){
        this.mapProdutos.put(codigo, new Produto(codigo, nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(this.mapProdutos);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!this.mapProdutos.isEmpty()){
            for (Produto produto : this.mapProdutos.values()) {
                valorTotalEstoque += (produto.getQuantidade() * produto.getPreco());
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        if(!this.mapProdutos.isEmpty()){
            double maiorValor = Double.MIN_VALUE;
            for (Produto produto : this.mapProdutos.values()) {
                if(produto.getPreco() > maiorValor){
                    maiorValor = produto.getPreco();
                    produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        if(!this.mapProdutos.isEmpty()){
            double menorValor = Double.MAX_VALUE;
            for (Produto produto : this.mapProdutos.values()) {
                if(produto.getPreco() < menorValor){
                    menorValor = produto.getPreco();
                    produtoMaisBarato = produto;
                }
            }
        }
        return produtoMaisBarato;
    }

     //Retorna o produto que está em maior quantidade no estoque, 
     //considerando o valor total de cada produto (quantidade * preço).
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
       Produto produtoARetornar = null;
       if(!this.mapProdutos.isEmpty()){
            double maiorValorTotalProdutoPorQuantidade = Double.MIN_VALUE;
            for (Produto produto : this.mapProdutos.values()) {
                double valorTotalProdutoPorQuantidade = (produto.getQuantidade() * produto.getPreco());
                if(valorTotalProdutoPorQuantidade > maiorValorTotalProdutoPorQuantidade){
                    maiorValorTotalProdutoPorQuantidade = valorTotalProdutoPorQuantidade;
                    produtoARetornar = produto;
                }
            }
       }
       return produtoARetornar;
    }

}
