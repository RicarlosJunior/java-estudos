package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }


    public void adicionarConvidado(int codigoConvite, String nome){
        this.convidados.add(new Convidado(codigoConvite, nome));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoARemover = null;
        for (Convidado convidado : this.convidados) {
            if(convidado.getCodigoConvite() == codigoConvite){
                convidadoARemover = convidado;
                break;
            }
        }
        if(convidadoARemover != null){
            this.convidados.remove(convidadoARemover);
        }
    }


    public int contarConvidados(){
        return this.convidados.size();
    }
    
    public void exibirConvidados(){
        System.out.println(this.convidados);
    }

}
