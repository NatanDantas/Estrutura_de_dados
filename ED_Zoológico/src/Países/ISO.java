package Países;

public class ISO {
    private String ISO;
    private String nome;
    private double populacao = 0;
    private double dimKm2 = 0;

    public ISO(String iSO, String nome, double populacao, double dimKm2) {
        this.ISO = " ";
        this.nome = " ";
        this.populacao = populacao;
        this.dimKm2 = dimKm2;
    }

    public String getISO() {
        return ISO;
    }

    public void setISO(String iSO) {
        ISO = iSO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimKm2() {
        return dimKm2;
    }

    public void setDimKm2(double dimKm2) {
        this.dimKm2 = dimKm2;
    }

    public double densidadePopulacional(double populacao, double dimKm2){

        double densidade = 0;
        densidade = populacao / dimKm2;
        return densidade;
    }
}
