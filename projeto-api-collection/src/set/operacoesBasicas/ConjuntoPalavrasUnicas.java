package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        this.palavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!this.palavras.isEmpty()){
            if(this.palavras.contains(palavra)){
                this.palavras.remove(palavra);
            }
        }else{
            System.out.println("Set vazio!");
        }
        
    }

    public boolean verificarPalavra(String palavra){
        return this.palavras.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(this.palavras);
    }
    
}
