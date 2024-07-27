import desafio.modelo.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
        
        IPhone iPhone = new IPhone();

        //Metodos implementados com base na Interface IAparelhoTelefonico
        iPhone.ligar("62993115166");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();


         //Metodos implementados com base na Interface IReprodutorMusical
         iPhone.tocar();
         iPhone.pausar();
         iPhone.selecionarMusica("Simple Man");

         //Metodos implementados com base na Interface INavegadorInternet
         iPhone.exibirPagina("https://www.linkedin.com/in/ricarlos-junior-51469031");
         iPhone.adicionarNovaAba();
         iPhone.atualizarPagina();
    }
}
