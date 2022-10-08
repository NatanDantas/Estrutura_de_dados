package Zoo;
public class Zoo extends Animal {
    private Animal zoo[];
    private int Animal = 0;
    private int Bicho = 0;
    public int tipo;

    // public Zoo(){}
    public Zoo(int qtdBicho) {
        zoo = new Animal[qtdBicho];
    }

    public Animal[] getZoo() {
        return zoo;
    }

    public void setZoo(Animal[] zoo) {
        this.zoo = zoo;
    }

    public Animal getBicho(Animal bicho) {
        return bicho;
    }

    public void setBicho(Animal bicho, int pos) {
        this.zoo[pos] = bicho;
    }

    public void setAnimal(Animal oLeao, int i) {
        this.Animal = Animal;
    }

    public void mostraAnimal() {
        for (int i = 0; i < zoo.length; i++) {
            System.out.println("Animal: " + zoo[i].getNome() + "\n");
        }
    }

    public int getAnimal() {
        return Animal;
    }

    public void setAnimal(int animal) {
        Animal = animal;
    }

    public int getBicho() {
        return Bicho;
    }

    public void setBicho(int bicho) {
        Bicho = bicho;
    }

    public int getTipo() {
        return tipo;
    }

    public void contarTipo(int tipo) {
        int mam = 0, ave = 0, rep = 0, outros = 0;
        int aux = 0;
        switch (tipo) {

            case 1:
                mam++;
                break;

            case 2:
                ave++;
                break;

            case 3:
                rep++;
                break;

            default:
                outros++;
                break;
        }
        if (mam > ave) {
            aux = mam;
            aux = ave;
        }

        if (ave > rep) {
            aux = ave;
            aux = rep;
        }

        if (outros > rep) {
            aux = outros;
            aux = rep;
        }
    }

    public void mostraTipo() {
        for (int i = 0; i < zoo.length; i++) {
            System.out.println("Tipos de Animais: " + getTipo());
        }
    }

    public void calcularTotalKilo() {
        int soma = 0;
        for (int i = 0; i < zoo.length; i++) {
            soma += getMassa();
            System.out.println(soma);
        }
    }

    public void maiorMassa(int massa) {
        int maiorAnimal = 0;
        int contador = 1;
        int aux1 = 0;
        int aux2 = 0;

        while (contador <= zoo.length) {
            contador++;
            aux1 = (int) getMassa();

            if (aux1 > maiorAnimal) {
                aux2 = maiorAnimal;
                maiorAnimal = aux1;
            }
            if (aux1 > maiorAnimal && aux1 > aux2) {
                aux2 = aux1;
            }
        }
        System.out.println(maiorAnimal);
    }



}
