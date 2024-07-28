package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoas(String nome, int idade, double getAltura){
        this.pessoas.add(new Pessoa(nome, idade, getAltura));
    }

    //metodo que orderna por idade usando a interface Comparable
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(this.pessoas);
        Collections.sort(pessoasPorIdade); //Comparable
        return pessoasPorIdade;
    }

    //metodo que orderna por altura usando a interface Comparator
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(this.pessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPessoa()); //Comparator
        return pessoasPorAltura;
    }

    

}
