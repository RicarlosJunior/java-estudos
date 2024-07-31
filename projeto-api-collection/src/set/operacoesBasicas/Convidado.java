package set.operacoesBasicas;

public class Convidado {
    private int codigoConvite;
    private String nome;

    public Convidado(int codigoConvite, String nome) {
        this.codigoConvite = codigoConvite;
        this.nome = nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Convidado [codigoConvite=" + codigoConvite + ", nome=" + nome + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoConvite;
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
        Convidado other = (Convidado) obj;
        if (codigoConvite != other.codigoConvite)
            return false;
        return true;
    }
    

    
}
