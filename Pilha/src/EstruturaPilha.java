public class EstruturaPilha {

    public static void main(String[] args) throws Exception {

        Pilha p = new Pilha();
        String a = "ESTE EXERCICIO E MUITO FACIL";
        String linha = "";
        String[] texto = a.split(" ");

        for (int i = 0; i < texto.length; i++) {
            for (int j = 0; j < texto[i].length(); j++) {
                p.push(texto[i].charAt(j));
            }
            int tam = p.tamanho();
            for (int f = 0; f < tam; f++) {
                linha += p.pop();
            }
            linha += " ";
        }

        System.out.println(linha);
    }
}
