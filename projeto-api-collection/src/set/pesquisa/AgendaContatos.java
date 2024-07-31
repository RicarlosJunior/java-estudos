package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, String numero){
        this.contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(this.contatos);
    }
    
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosARetornar = new HashSet<>();
        for (Contato contato : this.contatos) {
            if(contato.getNome().startsWith(nome)){
                contatosARetornar.add(contato);
            }
        }
        return contatosARetornar;
    }

    public Contato atualizarNumeroContato(String nome, String novoNumero){
        Contato contatoAtualizado = null;
        for (Contato contato : this.contatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

}
