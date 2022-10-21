import java.util.Map;
import java.util.TreeMap;
import java.util.*;

public class Dicionario {

    TreeMap<String, Palavra> oPalavra;

    public Dicionario() {
        oPalavra = new TreeMap<String, Palavra>();
    }

    public void inserirPalavra(String palavra, Palavra significado) {
        oPalavra.put(palavra, significado);
    }

    public void consultarPalavra(String palavra) {
        if (oPalavra.get(palavra) != null)
            oPalavra.get(palavra).mostrarPalavra();
        else
            System.out.println("Palavra não Encontrada");
    }

    public void listarPalavras() {
      Set<String> oR = oPalavra.keySet();
      Object ob[] = oR.toArray();
      
      for (int i = 0; i < ob.length; i++) {
      String chave = (String) (ob[i]);
      oPalavra.get(chave).mostrarPalavra();
      }
      
      }

}
