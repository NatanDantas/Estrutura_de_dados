public class Aviao {

    private String nomeAviao = "";
    private int idAviao = 0;

    public String getNomeAviao() {
        return nomeAviao;
    }

    public void setNomeAviao(String nomeAviao) {
        this.nomeAviao = nomeAviao;
    }

    public int getIdAviao() {
        return idAviao;
    }

    public void setIdAviao(int idAviao) {
        this.idAviao = idAviao;
    }

    public Aviao(String nomeAviao, int idAviao) {
        this.nomeAviao = nomeAviao;
        this.idAviao = idAviao;
    }

    public Aviao() {
    }

    public void imprimirAviao() {
        System.out.println("Avião:" + getNomeAviao() + "\n" + "\tnumero:" + getIdAviao());
    }

}
