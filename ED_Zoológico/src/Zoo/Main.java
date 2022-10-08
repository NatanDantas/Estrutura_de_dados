package Zoo;
public class Main {
    public static void main(String[] args) throws Exception {
        Animal oLeao = new Animal("Leo", 1, 300, 10);
        Animal oGirafa = new Animal("Pescocao", 1, 350, 12);
        // Animal oHipopotamo = new Animal("Moto Moto", 2, 350, 12);
        // Animal oLeoa = new Animal("Claudia", 4, 350, 12);
        // Animal oTartaruga = new Animal("Josival", 3, 350, 12);
        // oLeao.imprimir();
        // oGirafa.imprimir();

        Zoo oSafari = new Zoo(2);
        oSafari.setBicho(oLeao, 0);
        oSafari.setBicho(oGirafa, 1);
        // oSafari.setBicho(oHipopotamo, 2);
        // oSafari.setBicho(oLeoa, 3);
        // oSafari.setBicho(oTartaruga, 4);
        oSafari.mostraAnimal();
        oSafari.mostraTipo();
        oSafari.calcularTotalKilo();
    }

}
