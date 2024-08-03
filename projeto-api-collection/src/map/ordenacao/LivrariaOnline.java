package map.ordenacao;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;




public class LivrariaOnline {

        private Map<String, Livro> mapLivros;

        public LivrariaOnline() {
            this.mapLivros = new HashMap<>();
        }

        public void adicionarLivro(String link, String titulo, String autor, double preco){
            this.mapLivros.put(link, new Livro(titulo, autor, preco));
        }

        public void removerLivro(String titulo){
            if(!this.mapLivros.isEmpty()){
                Set<String> keys = new HashSet<>();
                for (Map.Entry<String, Livro> entry : this.mapLivros.entrySet()) {
                    if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                        keys.add(entry.getKey());
                    }
                }
                if(!keys.isEmpty()){
                   for (String key : keys) {
                        this.mapLivros.remove(key);
                   }
                }
            }
        }

        public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
            List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(this.mapLivros.entrySet());
            Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPreco());

            Map<String, Livro> mapLivrosPorPreco = new LinkedHashMap<>();
            for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
                mapLivrosPorPreco.put(entry.getKey(), entry.getValue());
            }
            return mapLivrosPorPreco;
        }

        public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
            Map<String, Livro> mapLivrosPorAutor = null;
            if(!this.mapLivros.isEmpty()){
                mapLivrosPorAutor = new HashMap<>();
                for (Map.Entry<String,Livro> entry : this.mapLivros.entrySet()) {
                    if(entry.getValue().getAutor().equals(autor)){
                        mapLivrosPorAutor.put(entry.getKey(), entry.getValue());
                    } 
                }
            }
            return mapLivrosPorAutor;
        }

        public Livro obterLivroMaisCaro(){
            Livro livroMaisCaro = null;
            if(!this.mapLivros.isEmpty()){
                double precoMaisCaro = Double.MIN_VALUE;
                for (Livro livro : this.mapLivros.values()) {
                    if(livro.getPreco() > precoMaisCaro){
                        precoMaisCaro = livro.getPreco();
                        livroMaisCaro = livro;
                    }
                }
            }
            return livroMaisCaro;
        }

        public Livro obterLivroMaisBarato(){
            Livro livroMaisBarato = null;
            if(!this.mapLivros.isEmpty()){
                double precoMaisBarato = Double.MAX_VALUE;
                for (Livro livro : this.mapLivros.values()) {
                    if(livro.getPreco() < precoMaisBarato){
                        precoMaisBarato = livro.getPreco();
                        livroMaisBarato = livro;
                    }
                }
            }
            return livroMaisBarato;
        }

}
