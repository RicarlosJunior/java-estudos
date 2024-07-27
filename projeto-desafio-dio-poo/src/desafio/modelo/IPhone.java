package desafio.modelo;

import desafio.servico.AparelhoTelefonico;
import desafio.servico.NavegadorInternet;
import desafio.servico.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    @Override
    public void exibirPagina(String url) {
       System.out.println("Exibindo a pagina: "+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: "+musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: "+numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz!");
    }

}
