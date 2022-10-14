public class App {
    public static void main(String[] args) throws Exception {

        Fila oGerenciador = new Fila();

        for (int i = 0; i < 10; i++) {
            oGerenciador.inqueue(new Processo(104 + i, "Windows Manager", 4, 20));
            ((Processo) oGerenciador.primeiroLista()).imprimeProcesso();
        }

        int contador = oGerenciador.tamanho();
        for (int i = 0; i < contador; i++) {
            ((Processo) oGerenciador.dequeue()).imprimeProcesso();
            System.out.println("Executando processo " + oGerenciador.pegar(i));
        }

    }
}
