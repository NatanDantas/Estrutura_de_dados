public class Processo {

    private int id;
    private String nome;
    private int prioridade;
    private int espera;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public Processo(int id, String nome, int prioridade, int espera) {
        this.id = id;
        this.nome = nome;
        this.prioridade = prioridade;
        this.espera = espera;
    }

    public void imprimeProcesso() {
        System.out.println("Processo: " + getNome() + "\n" + "\tID: " + getId() + "\n" + "\tPrioridade: " + getPrioridade() + "\n" + "\tEspera: " + getEspera());
    }

    public int getEspera() {
        return espera;
    }

    public void setEspera(int espera) {
        this.espera = espera;
    }

}
