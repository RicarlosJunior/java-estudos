package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    
    private Map<String, Integer> mapContatos;

    public AgendaContatos() {
        this.mapContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero){
        this.mapContatos.put(nome, numero);
    }

    public void removerContato(String nome){
        if(!this.mapContatos.isEmpty()){
            this.mapContatos.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(this.mapContatos);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!this.mapContatos.isEmpty()){
            numeroPorNome = mapContatos.get(nome);
        }
        return numeroPorNome;

    }


}
