package list.operacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefa {
    
    private List<Tarefa> tarefas;

    public ListaTarefa() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasARemover = new ArrayList<>();
        for (Tarefa tarefa : this.tarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasARemover.add(tarefa);
            }
        }
        tarefas.removeAll(tarefasARemover);
    }


    public int obterNumeroTotalTarefas(){
        return this.tarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(this.tarefas);
    }

}
