
/*import list.operacoesBasicas.CarrinhoDeCompra;
import list.operacoesBasicas.ListaTarefa;
import list.ordenacao.OrdenacaoNumeros;
import list.ordenacao.OrdenacaoPessoas;
import list.pesquisa.CatalogoLivros;
import list.pesquisa.Livro;
import list.pesquisa.SomaNumeros;
import set.operacoesBasicas.ConjuntoPalavrasUnicas;
import set.ordenacao.CadastroProduto;
import set.ordenacao.GerenciadorAluno;
import set.pesquisa.AgendaContatos;
import set.pesquisa.ListaTarefas;
import map.pesquisa.EstoqueProdutos;
import map.pesquisa.ContagemPalavras;
import map.ordenacao.AgendaEventos;
import map.ordenacao.Evento;
import map.ordenacao.LivrariaOnline;
import map.ordenacao.Livro;

import java.time.LocalDate;
import java.util.Map;*/

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
        System.out.println("pesquisarPorTitulo: " + catalogoLivros.pesquisarPorTitulo("Livro 1"));*/

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

        /*CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto(1, "Caneta", 4.20, 1);
        cadastroProduto.adicionarProduto(2, "Caderno", 20.0, 1);
        cadastroProduto.adicionarProduto(3, "Livro", 98.99, 1);
        cadastroProduto.adicionarProduto(4, "Adesivo", 8, 1);
        System.out.println("Ordenando por nome:"+cadastroProduto.exibirProdutosPorNome());
        System.out.println("Ordenando por preço:"+cadastroProduto.exibirProdutosPorPreco());*/

       /*GerenciadorAluno gerenciadorAluno = new GerenciadorAluno();
        gerenciadorAluno.adicionarAluno(1, "Ricarlos", 8);
        gerenciadorAluno.adicionarAluno(2, "Fernanda", 9);
        gerenciadorAluno.adicionarAluno(4, "Yuri", 5);
        gerenciadorAluno.adicionarAluno(3, "Cecilia", 10);
        gerenciadorAluno.exibirAlunos();
        gerenciadorAluno.exibirAlunosPorNome();
        gerenciadorAluno.exibirAlunosPorNota();
        gerenciadorAluno.removerAluno(4);
        System.out.println("*************************");
        gerenciadorAluno.exibirAlunos();
        gerenciadorAluno.exibirAlunosPorNome();
        gerenciadorAluno.exibirAlunosPorNota();*/ 

        /*AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Ricarlos", 993115165);
        agendaContatos.adicionarContato("Fernanda", 993115166);
        agendaContatos.adicionarContato("Cecilia", 000000000);
        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Cecilia");
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Ricarlos"));*/

        /*Dicionario dicionario = new Dicionario();
        dicionario.exibirPalavras();
        dicionario.adicionarPalvra("Teste", "Teste");
        dicionario.adicionarPalvra("Teste1", "Teste1");
        dicionario.adicionarPalvra("Teste2", "Teste2");
        dicionario.adicionarPalvra("Teste3", "Teste33");
        dicionario.exibirPalavras();
        dicionario.removerPalavra("Teste1");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Teste3"));*/

        /*EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1, "Caneta", 1, 3d);
        estoqueProdutos.adicionarProduto(2, "Adesivo", 1, 10d);
        estoqueProdutos.adicionarProduto(3, "Boracha", 1, 1d);
        estoqueProdutos.exibirProdutos();
        System.out.println("*************************************************");
        System.out.println("Mais Caro "+estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Mais Barato "+estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("Maior Qtde por Valor "+estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
        System.out.println("Valor Total Estoque "+estoqueProdutos.calcularValorTotalEstoque());*/

        /*ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.exibirContagemPalavras();
        contagemPalavras.adicionarPalavra("Teste", 10);
        contagemPalavras.adicionarPalavra("Teste1", 15);
        contagemPalavras.exibirContagemPalavras();
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
        contagemPalavras.removerPalavra("Teste1");
        contagemPalavras.exibirContagemPalavras();*/

        /*AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.exibirAgenda();
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 30), "Especial Niver Ricarlos", "Sabor de Forro");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 3, 16), "Especial Niver Cecilia", "Galinha Pintadinha");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 11, 17), "Especial Niver Fernanda", "Gilberto Gil");
        agendaEventos.exibirAgenda();
        Evento proximoEvento = agendaEventos.obterProximoEvento();
        if(proximoEvento != null){
            System.out.println("Próximo Evento: "+proximoEvento.getNomeEvento()+", Atração: "+proximoEvento.getNomeAtracao());
        }*/

        /*LivrariaOnline livrariaOnline = new LivrariaOnline();
        livrariaOnline.adicionarLivro("1", "Titulo1", "Titulo11", 5d);
        livrariaOnline.adicionarLivro("2", "Titulo1", "Titulo1", 7d);
        livrariaOnline.adicionarLivro("3", "Titulo2", "Titulo1", 6d);
        livrariaOnline.adicionarLivro("4", "Titulo2", "Titulo1", 9d);
        livrariaOnline.adicionarLivro("5", "Titulo2", "Titulo1", 2d);
        livrariaOnline.adicionarLivro("6", "Titulo2", "Titulo1", 3d);
        Map<String, Livro> livrosPorAutor = livrariaOnline.pesquisarLivrosPorAutor("Titulo11");
        if(livrosPorAutor != null){
            System.out.println(livrosPorAutor);
        }
        Livro livro = livrariaOnline.obterLivroMaisCaro();
        if(livro != null){
           System.out.println("Livro mais caro: "+livro.getPreco());
        }
        livro = livrariaOnline.obterLivroMaisBarato();
        if(livro != null){
            System.out.println("Livro mais barato: "+livro.getPreco());
        }
        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());*/

    }
}
