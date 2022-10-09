public class App {
    public static void main(String[] args) throws Exception {

        Fila oAeroporto = new Fila();

        for (int i = 0; i < 10; i++) {
            oAeroporto.inqueue(new Aviao("Boeing 777" + i, i + 1));
            // System.out.println(oAeroporto.tamanho());
            ((Aviao) oAeroporto.primeiroLista()).imprimirAviao();

        }

        for (int i = 0; i < oAeroporto.tamanho(); i++) {
            ((Aviao) oAeroporto.pegar(i)).imprimirAviao();
        }

        int cont = oAeroporto.tamanho();
        for (int i = 0; i < cont; i++) {
            ((Aviao) oAeroporto.dequeue()).imprimirAviao();

        }

        String msg = oAeroporto.tamanho() == -1 ? "0 Aviões" : oAeroporto.tamanho() + "Aviões";
        System.out.println("Fila de Aviões: " + msg);
    }
}
