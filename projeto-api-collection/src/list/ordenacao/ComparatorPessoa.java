package list.ordenacao;

import java.util.Comparator;

public class ComparatorPessoa implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
       return Double.compare(p1.getAltura(), p2.getAltura());
    }

}
