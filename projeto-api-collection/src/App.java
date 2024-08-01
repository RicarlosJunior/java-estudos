import java.util.List;
import java.util.Set;

import list.operacoesBasicas.CarrinhoDeCompra;
import list.operacoesBasicas.ListaTarefa;
import list.ordenacao.OrdenacaoNumeros;
import list.ordenacao.OrdenacaoPessoas;
import list.pesquisa.CatalogoLivros;
import list.pesquisa.Livro;
import list.pesquisa.SomaNumeros;
import set.operacoesBasicas.ConjuntoPalavrasUnicas;
import set.ordenacao.CadastroProduto;
import set.pesquisa.AgendaContatos;
import set.pesquisa.ListaTarefas;

public class App {
    public static void main(String[] args) throws Exception {
        /* 
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Quantidade de tarefas: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("Quantidade de tarefas: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();


        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("Quantidade de tarefas: "+ listaTarefa.obterNumeroTotalTarefas());
        */

        /*CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        carrinhoDeCompra.adicionarItem("CS2", 100.0, 1);
        carrinhoDeCompra.adicionarItem("Monitor", 1000.0, 2);
        carrinhoDeCompra.adicionarItem("Teclado", 200.0, 1);

        System.out.println("Valor Total: " + carrinhoDeCompra.calcularValorTotal());

        carrinhoDeCompra.removerItem("Teclado");

        System.out.println("Valor Total Apos: " + carrinhoDeCompra.calcularValorTotal());
        
        carrinhoDeCompra.exibirItens();*/


        /*CatalogoLivros catalogoLivros = new CatalogoLivros();


        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2022);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2022);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2022);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 2023);
        catalogoLivros.adicionarLivro("Livro 6", "Autor 5", 2023);
        catalogoLivros.adicionarLivro("Livro 7", "Autor 7", 2024);
        catalogoLivros.adicionarLivro("Livro 8", "Autor 8", 2024);

     
        System.out.println("pesquisarPorAutor: " + catalogoLivros.pesquisarPorAutor("Autor 5"));
        System.out.println("pesquisarPorAnoPublicacao: " + catalogoLivros.pesquisarPorAnoPublicacao(2023, 2024));
        System.out.println("pesquisarPorTitulo: " + catalogoLivros.pesquisarPorTitulo("Livro 1"));
        */


        /*SomaNumeros somaNumeros = new SomaNumeros();


        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(-5);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(-5);

        System.out.println(somaNumeros.encontrarMaiorNumero());

        System.out.println(somaNumeros.encontrarMenorNumero());

        somaNumeros.exibirNumeros();

        System.out.println(somaNumeros.realizarSoma()); */




        /*OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoas("Junior", 32, 1.79);
        ordenacaoPessoas.adicionarPessoas("Fernanda", 35, 1.70);
        ordenacaoPessoas.adicionarPessoas("Cecilia", 1, 0.88);

        System.out.println(ordenacaoPessoas.ordenarPorAltura());*/



        /*OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(3);

        ordenacaoNumeros.ordenarAscendente();

        ordenacaoNumeros.ordenarDescendente();*/


        /*ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        
        conjuntoPalavrasUnicas.adicionarPalavra("Madara");
        conjuntoPalavrasUnicas.adicionarPalavra("Itachi");
        conjuntoPalavrasUnicas.adicionarPalavra("Obito");
        conjuntoPalavrasUnicas.adicionarPalavra("Kakashi");
   
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Obito");
        
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Itachi"));*/

        /*AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Junior", "111111111");
        agendaContatos.adicionarContato("Fernanda", "222222222");
        agendaContatos.adicionarContato("Cecilia", "333333333");
        agendaContatos.adicionarContato("Junior Cesar", "4444444444");
        agendaContatos.adicionarContato("Junior Silva", "4444444444");

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Junior"));

        agendaContatos.atualizarNumeroContato("Junior Silva", "5555555555");

        agendaContatos.exibirContatos();*/

        /*ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.exibirTarefas();
        listaTarefas.adicionarTarefa("Treinar");
        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.contarTarefas());
        listaTarefas.removerTarefa("Treinar");
        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaPendente("Treinar");
        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaConcluida("Treinar");
        listaTarefas.exibirTarefas();

       

        System.out.println("Tarefas Concluidas: "+listaTarefas.obterTarefasConcluidas());

        System.out.println("Tarefas Pendentes: "+listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();*/


        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto(1, "Caneta", 4.20, 1);
        cadastroProduto.adicionarProduto(2, "Caderno", 20.0, 1);
        cadastroProduto.adicionarProduto(3, "Livro", 98.99, 1);
        cadastroProduto.adicionarProduto(4, "Adesivo", 8, 1);

        System.out.println("Ordenando por nome:"+cadastroProduto.exibirProdutosPorNome());

        System.out.println("Ordenando por preço:"+cadastroProduto.exibirProdutosPorPreco());





    }
}
