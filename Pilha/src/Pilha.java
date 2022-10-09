import java.util.ArrayList;;

public class Pilha {

    ArrayList<Object> oPilha;

    public Pilha() {
        oPilha = new ArrayList<Object>();
    }

    public void push(Object elemento) {

        oPilha.add(elemento);

    }

    public boolean isVazia() {

        return oPilha.isEmpty() ? true : false;

    }

    public Object pop() {

        return isVazia() ? null : oPilha.remove(oPilha.size() - 1);

    }

    public void listar() {

        for (int i = oPilha.size() - 1; i >= 0; i--) {

            System.out.println(oPilha.get(i));
        }

    }

    public int tamanho() {
        
        return isVazia()?-1:oPilha.size();
    }

    public Object primeiro() {

        return isVazia() ? null : oPilha.get(oPilha.size() - 1);

    }

    public Object ultimo() {

        return isVazia() ? null : oPilha.get(0);

    }

}
