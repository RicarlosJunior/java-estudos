import list.operacoesBasicas.CarrinhoDeCompra;
//import list.operacoesBasicas.ListaTarefa;

public class App {
    public static void main(String[] args) throws Exception {
        /* 
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Quantidade de tarefas: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("Quantidade de tarefas: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();


        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("Quantidade de tarefas: "+ listaTarefa.obterNumeroTotalTarefas());
        */

        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        carrinhoDeCompra.adicionarItem("CS2", 100.0, 1);
        carrinhoDeCompra.adicionarItem("Monitor", 1000.0, 2);
        carrinhoDeCompra.adicionarItem("Teclado", 200.0, 1);

        System.out.println("Valor Total: " + carrinhoDeCompra.calcularValorTotal());

        carrinhoDeCompra.removerItem("Teclado");

        System.out.println("Valor Total Apos: " + carrinhoDeCompra.calcularValorTotal());
        
        carrinhoDeCompra.exibirItens();




    }
}
