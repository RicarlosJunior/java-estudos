package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio3TodosNumerosPositivos {
    public static void main(String[] args) {
        
         List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Verifica se todos os elementos da Stream atendem ao predicado especificado 
        //(Todos os numero sao positivos)
         boolean todosNumerosPositivos = numeros.stream().
                                                allMatch(n -> n > 0);
         System.out.println(todosNumerosPositivos);

    }
}
