package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }
    
    public void ordenarAscendente(){
        List<Integer> numerosAcendentes = new ArrayList<>(this.numeros);
        Collections.sort(numerosAcendentes);
        System.out.println("Ascendente: "+ numerosAcendentes);
    }

    public void ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(this.numeros);
        numerosDescendente.sort(Collections.reverseOrder());
        System.out.println("Descendente: "+ numerosDescendente);
    }

}
