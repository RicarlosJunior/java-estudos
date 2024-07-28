package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    private List<Item> itens;

    public CarrinhoDeCompra() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.itens.add(new Item(nome, preco, quantidade));
    }
    
    public void removerItem(String nome){
        List<Item> itensARemover = new ArrayList<>();
        for(Item item : this.itens){
            if(item.getNome().equalsIgnoreCase(nome)){
                itensARemover.add(item);
            }
        }
        this.itens.removeAll(itensARemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item item : this.itens) {
            valorTotal += (item.getPreco() * item.getQuantidade());
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(this.itens);
    }


}
