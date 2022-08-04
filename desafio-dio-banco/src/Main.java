
public class Main {

    public static void main(String[] args) {
        Cliente phellype = new Cliente();
        phellype.setNome("Phellype");

        Conta cc = new ContaCorrente(phellype);
        Conta poupanca = new ContaPoupanca(phellype);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}