import java.util.*;

public class Fila {
    LinkedList<Object> oFila;

    public Fila() {
        oFila = new LinkedList<Object>();
    }

    public void inqueue(Object elemento) {

        oFila.add(elemento);

    }

    public boolean isVazia() {

        return oFila.isEmpty() ? true : false;

    }

    public Object dequeue() {

        return isVazia() ? null : oFila.remove(oFila.size() - 1);

    }

    public void listar() {

        for (int i = oFila.size() - 1; i >= 0; i--) {

            System.out.println(oFila.get(i));
        }

    }

    public int tamanho() {
        return isVazia() ? -1 : oFila.size();
    }

    public Object primeiroLista() {

        return isVazia() ? null : oFila.get(oFila.size() - 1);

    }

    public Object ultimoLista() {

        return isVazia() ? null : oFila.get(0);

    }
}
