package map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;



public class AgendaEventos {
    private Map<LocalDate, Evento> mapEventos;

    public AgendaEventos() {
        this.mapEventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao){
        this.mapEventos.put(data, new Evento(nomeEvento, nomeAtracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> treeMapEventos = new TreeMap<>(this.mapEventos);
        System.out.println(treeMapEventos);
    }

    public Evento obterProximoEvento(){
        Evento proximoEvento = null;
        if(!this.mapEventos.isEmpty()){
            LocalDate dataAtual = LocalDate.now();
            Map<LocalDate, Evento> treeMapEventos = new TreeMap<>(this.mapEventos);
            for (Map.Entry<LocalDate, Evento> entry : treeMapEventos.entrySet()) {
                if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                    proximoEvento = entry.getValue();
                    break;
                }    
            }
        }
        return proximoEvento;
    }




    
}
