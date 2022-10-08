package Zoo;
public class Animal {
    /* TAD de Animal */
    public String nome;
    public int tipo;
    public double massa,velocidade;
    
    /* Construtor vazio*/
    public Animal() {
    }

    public Animal(String nome, int tipo, double massa, double velocidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.massa = massa;
        this.velocidade = velocidade;
    }

    public  void imprimir(){
        System.out.println(nome+"\n"+ tipo +"\n"+massa+"\n"+velocidade);
    }
    
    public String getNome() { 
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getTipo(int tipo){
        return tipo;
    }
    
}
