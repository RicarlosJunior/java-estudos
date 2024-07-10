public class TiposVariaveis {
    
    //Conceito basico de variavel (Variavel é um espaço reservado na memoria)
    //No Java NÃO é permitido:

    //Criar variavel iniciando com numero ex: int 1pacote = 0;
    //Criar variavel com espaço quando o nome é composto ex: int primeiro pacote = 0;
    //Criar variavel com caracter especiais exceto (_ $) ex: primeiro/pacote = 0;
    //Criar variabel com palavras reservadas pela linguagem ex: int long = 0;

    //Agora vamos corrigir os exemplos acima
    //int primeiroPacote = 0;
    //int primeiroPacote = 0;
    //int primeiro$pacote = 0; ou int primeiro_pacote =0; obs nome so para estudo!
    //int longo - 0;
    
    public static void main(String[] args) throws Exception {
       
        //tipos primitivos
        
        /*byte 
        short
        int 
        long 
        float   
        double
        boolean */

        //toda variavel tem um Tipo (Obrigatorio) um Nome (Obrigatorio) e um Valor (Opcional)
        //Exemplo:
        int idade = 32;
        boolean estaEstudando = true;


        System.out.println("Idade: "+idade);
        System.out.println("Está estudando: "+estaEstudando);


        //(cast) ou popular mente chamado de coerção, é um conceito aplicado em variaveis com tipo de capacidade
        //para receber um valor maior e quero mesmo assim atribuir esse valor a uma variavel com seu tipo menor.
        //Exemplo
        int idadeComTipoDeDadoMaior = 32; //variavel inteira com capacidade de armazenar um dado muito maior que um short
        short idadeComTipoDeDadoMenor = (short) idadeComTipoDeDadoMaior; //cast aplicado

        System.out.println("Cast: "+idadeComTipoDeDadoMenor);




    }
}
