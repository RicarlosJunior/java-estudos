package set.pesquisa;

public class Tarefa {
    
    private String descricacao;
    private boolean concluida;
    
    public Tarefa(String descricacao) {
        this.descricacao = descricacao;
    }

    public String getDescricacao() {
        return descricacao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setDescricacao(String descricacao) {
        this.descricacao = descricacao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }


    @Override
    public String toString() {
        return "{" + descricacao + ", concluída: " + concluida + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricacao == null) ? 0 : descricacao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarefa other = (Tarefa) obj;
        if (descricacao == null) {
            if (other.descricacao != null)
                return false;
        } else if (!descricacao.equals(other.descricacao))
            return false;
        return true;
    }

}
