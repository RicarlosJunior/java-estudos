package map.ordenacao;
import java.util.Comparator;
import java.util.Map;

public class ComparatorPreco implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> entry1, Map.Entry<String, Livro> entry2) {
        return Double.compare(entry1.getValue().getPreco(), entry2.getValue().getPreco());
    }

}
