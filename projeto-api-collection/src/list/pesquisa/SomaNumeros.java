package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }
    
    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int realizarSoma(){
        int resultadoSoma = 0;
        if(!this.numeros.isEmpty()){
            for (Integer numero : numeros) {
                resultadoSoma += numero.intValue();
            }
        }
        return resultadoSoma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumeroLista = Integer.MIN_VALUE;
        for (Integer numero : numeros) {
            if(numero.intValue() > maiorNumeroLista){
                maiorNumeroLista = numero.intValue();
            }
        }
        return maiorNumeroLista;
    }


    public int encontrarMenorNumero(){
        int menorNumeroLista = Integer.MAX_VALUE;
        for (Integer numero : numeros) {
            if(numero.intValue() < menorNumeroLista){
                menorNumeroLista = numero.intValue();
            }
        }
        return menorNumeroLista;
    }


    public void exibirNumeros(){
        System.out.println(this.numeros);
    }

}
