package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio2SomaNumerosPares {
    public static void main(String[] args) {
        
         List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Filtrando so os pares e retornando uma lista
        List<Integer> numerosPares =  numeros.stream()
                                             .filter(n -> n % 2 == 0)
                                             .toList();

        System.out.println(numerosPares);                                     
 
        //Filtrando os numeros pares e somando os mesmos com reduce e retornando o resultado da soma
        int somaDosNumerosPares = numeros.stream()
                                .filter(n -> n % 2 == 0)
                                .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println(somaDosNumerosPares);

    }
}
