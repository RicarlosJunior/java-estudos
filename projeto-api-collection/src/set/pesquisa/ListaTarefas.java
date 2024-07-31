package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaARemover = null;
        if(!this.tarefas.isEmpty()){
            for (Tarefa tarefa : this.tarefas) {
                if(tarefa.getDescricacao().equalsIgnoreCase(descricao)){
                    tarefaARemover = tarefa;
                    break;
                }
            }
            if(tarefaARemover != null){
                this.tarefas.remove(tarefaARemover);
            }else{
                System.out.println("Não existe nenhuma tarefa com essa descrição!");
            }
        }else{
            System.out.println("Não existe tarefa lançada!");
        }
    }

    public void exibirTarefas(){
        System.out.println(this.tarefas);
    }

    public int contarTarefas(){
        return this.tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : this.tarefas) {
            if(tarefa.isConcluida()){
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : this.tarefas) {
            if(!tarefa.isConcluida()){
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        boolean tarefaAtualizada = false;
        for (Tarefa tarefa : this.tarefas) {
            if(tarefa.getDescricacao().equalsIgnoreCase(descricao)){
                tarefa.setConcluida(true);
                tarefaAtualizada = true;
                break;
            }
        }
        if(tarefaAtualizada){
            System.out.println("Tarefa concluida!");
        }else{
            System.out.println("Não existe nenhuma tarefa com essa descrição!");
        }
    }

    public void marcarTarefaPendente(String descricao){
        boolean tarefaAtualizada = false;
        for (Tarefa tarefa : this.tarefas) {
            if(tarefa.getDescricacao().equalsIgnoreCase(descricao)){
                tarefa.setConcluida(false);
                tarefaAtualizada = true;
                break;
            }
        }
        if(tarefaAtualizada){
            System.out.println("Tarefa  pendente!");
        }else{
            System.out.println("Não existe nenhuma tarefa com essa descrição!");
        }
    }

    public void limparListaTarefas(){
        if(!this.tarefas.isEmpty()){
            this.tarefas.clear();
        }else{
            System.out.println("Não existe tarefa lançada!");
        }
    }

}
