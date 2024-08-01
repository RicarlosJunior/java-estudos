package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAluno {
    private Set<Aluno> alunos;

    public GerenciadorAluno(){
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(long matricula, String nome, double nota){
        this.alunos.add(new Aluno(matricula, nome, nota));
    }

    public void removerAluno(long matricula){
        Aluno alunoARemover = null;
        if(!this.alunos.isEmpty()){
            for (Aluno aluno : this.alunos) {
                if(aluno.getMatricula() == matricula){
                    alunoARemover = aluno;
                    break;
                }
            }
            if(alunoARemover != null){
                this.alunos.remove(alunoARemover);
            }else{
                System.out.println("Nenhum aluno cadastrado com a matricula informada.");
            }
        }else{
            System.out.println("Nenhum aluno cadastrado.");
        }
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(this.alunos);
        System.out.println(alunosPorNome);
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorAluno());
        alunosPorNota.addAll(this.alunos);
        System.out.println(alunosPorNota);
    }

    public void exibirAlunos(){
        System.out.println(this.alunos);
    }

}
