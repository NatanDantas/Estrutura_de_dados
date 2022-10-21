public class Main {
    public static void main(String[] args) throws Exception {
        Palavra oDC = new Palavra("Carro", "Veículo de locomoção");
        Palavra oDC2 = new Palavra("Celular", "Dispositivo de comunicação");
        Palavra oDC3 = new Palavra("Cachorro", "Animal de estimação");

        Dicionario oP = new Dicionario();

        oP.inserirPalavra(oDC.getPalavra(), oDC);
        oP.inserirPalavra(oDC2.getPalavra(), oDC2);
        oP.inserirPalavra(oDC3.getPalavra(), oDC3);
        
        oP.listarPalavras();

        oP.consultarPalavra("Cachorro");
    }
}
