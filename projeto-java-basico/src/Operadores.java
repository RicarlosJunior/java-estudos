public class Operadores {
    
    public static void main(String[] args) {
        
        //Operador de Atribuição ( = )
        //É responsavel por atribuir um valor a uma variavel/Referencia.
        //Exemplo
        int idade = 32;
        double salario = 10000.0;
        boolean estaEstudando = true;

        //Operadores Aritimetico (+ - / * % )
        //São usados para realizar operações matematicas
        //Exemplo: 
        double salarioLiquido = 10000.0 - 1400.0;
        int idadeAniversariante = 32 + 1;
        double media = 90 / 10;
        double valorHoraExtra = 100.0 * 2;
        double modulo = 18 % 3;

        //Operadores Logicos (&& !! !)
        //Sao usados em comparação geralmente
        //Exemplo 
        
        //As duas expressoes tem que ser verdadeiras 
        if(idade == idadeAniversariante && salario == salarioLiquido){
            //logica
        }

        //Pelo menos uma das duas expressoes tem que ser verdadeirasa
        if(idade == idadeAniversariante || salario == salarioLiquido){
            //logica
        }
        
        //Negação se o conteudo da variavel for true fica false e se for false fica true 
        //(Obs ele nao alterar o valor da variavel)
        if(!estaEstudando){
            // Logica aqui
        }





    }

}
