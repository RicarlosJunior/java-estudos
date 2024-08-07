package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio1NumeroOrdemCrescente {

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Classifica os elementos da Stream em ordem natural (se os elementos forem comparáveis) 
        //ou de acordo com um comparador fornecido
        //depois estou gerando uma lista
        List<Integer> numerosOrdenados = numeros.stream()
                                                .sorted()
                                                .toList();


        System.out.println(numerosOrdenados);

    }

}
