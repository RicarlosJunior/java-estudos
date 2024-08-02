package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> mapPalavras;

    public Dicionario() {
        this.mapPalavras = new HashMap<>();
    }

    public void adicionarPalvra(String palavra, String defincao){
        this.mapPalavras.put(palavra, defincao);
    }

    public void removerPalavra(String palavra){
        if(!this.mapPalavras.isEmpty()){
            this.mapPalavras.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(this.mapPalavras);
    }

    public String pesquisarPorPalavra(String palavra){
        String definicao = "";
        if(!this.mapPalavras.isEmpty()){
            definicao = this.mapPalavras.get(palavra);
        }
        return definicao;
    }
    
}
