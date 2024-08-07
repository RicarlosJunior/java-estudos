package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio6NumeroMaior10 {

     public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        //Verifica se algum elemento da Stream atende ao predicado especificado. (Numero > 10)
        boolean numeroMaior10 = numeros.stream()
                                        .anyMatch(n -> n > 10);

        System.out.println(numeroMaior10);
    
    }
}
