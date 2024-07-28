import list.operacoesBasicas.ListaTarefa;

public class App {
    public static void main(String[] args) throws Exception {

        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Quantidade de tarefas: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("Quantidade de tarefas: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();


    }
}
