import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        TreeSet<Pessoa> oX = new TreeSet<Pessoa>();

        oX.add(new Pessoa("Natan", 1));
        oX.add(new Pessoa("João", 3));
        oX.add(new Pessoa("Carlos", 5));
        oX.add(new Pessoa("Carla", 7));

        Iterator<Pessoa> pessoasAsIterator = oX.iterator();
        while (pessoasAsIterator.hasNext()) {
            pessoasAsIterator.next().mostrar();

        }

        System.out.println(oX.toString());
    }
}

/*
 * Crie uma classe "Conta Bancária" com os seguintes atributos;
 * Número da conta - Int
 * Titular - String
 * Saldo - Double
 * 
 * Esta classe deve conter 3 Métodos;
 * public void sacar(diybke)
 * Depositar
 * Extrato
 * 
 * Criar uma classe Banco com um conjunto de contas, não podem existir contas duplicadas;
 * Criar uma conta para o Banco e mostrar toda a movimentação realizada pelo cliente;(Extrato)
 * 
 */