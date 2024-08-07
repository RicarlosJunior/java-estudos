package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio4RemoverNumerosImpares {
    public static void main(String[] args) {
        
         List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
         //Filtrando so os numeros pares e gerando um list com esse resultado
         List<Integer> numerosPares = numeros.stream()
                                            .filter(n -> n % 2 == 0)
                                            .toList();

        //usando consumer para exibir o valor de cada elemento.
         numerosPares.forEach(n -> System.out.println(n));

    }
}
