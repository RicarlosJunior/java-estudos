package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> mapPalavras;

    public ContagemPalavras() {
        this.mapPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        this.mapPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(!this.mapPalavras.isEmpty()){
            this.mapPalavras.remove(palavra);
        }else{
            System.out.println("Map está vazio.");
        }
    }

    public void exibirContagemPalavras(){
        System.out.println(this.mapPalavras);
    }

    public Map<String, Integer> encontrarPalavraMaisFrequente(){
        Map<String, Integer> palavraMaisFrequente = new HashMap<>();
        if(!this.mapPalavras.isEmpty()){
            int qtdeVezesPalavra = Integer.MIN_VALUE;
            for (Map.Entry<String, Integer> entry : this.mapPalavras.entrySet()) {
                if(entry.getValue() > qtdeVezesPalavra){
                    qtdeVezesPalavra = entry.getValue();
                    palavraMaisFrequente.clear(); 
                    palavraMaisFrequente.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return palavraMaisFrequente;
    }


    
}
