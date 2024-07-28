package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        this.livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = null;
        if(!this.livros.isEmpty()){
            livrosPorAutor = new ArrayList<>();
            for (Livro livro : this.livros) {
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }
    
    public List<Livro> pesquisarPorAnoPublicacao(int anoInicial, int anoFinal){
        List<Livro> livrosPorAnoPublicacao = null;
        if(!this.livros.isEmpty()){
            livrosPorAnoPublicacao = new ArrayList<>();
            for (Livro livro : this.livros) {
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosPorAnoPublicacao.add(livro);
                }
            }
        }
        return livrosPorAnoPublicacao;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroEncontrado = null;
        if(!this.livros.isEmpty()){
            for (Livro livro : this.livros) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroEncontrado = livro; 
                    break;
                }
              
            }
        }
        return livroEncontrado;
    }

}
