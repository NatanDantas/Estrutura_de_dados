public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String mostrar() {
        return "ID: " + getId() + "Nome: " + "\n" + getNome();
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ".....Nome: " + getNome();
    }

    public int compareTo(Pessoa p) {
        if (this.id < p.id) {
            return -1;
        }
        if (this.id > p.id) {
            return 1;
        }

        return 0;
    }

}
