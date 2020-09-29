package labs11_pt2;

public class TestaAssociacao {

    public static void main(String args[]) {
        Banco banco = new Banco("Globalcode Bank", 1000, 5);
        Agencia ag1 = banco.abrirAgencia();
        Agencia ag2 = banco.abrirAgencia();
        Agencia ag3 = banco.abrirAgencia();
        
        banco.imprimeAgencias();
        Cliente cliente1 = new Cliente("Joao da Silva", "1232323");
        Cliente cliente2 = new Cliente("Pedro Moraes", "123423");
        Conta c1 = ag1.abrirConta(4000, cliente1);
        Conta c2 = ag1.abrirConta(5000, cliente2);
        Conta c3 = ag2.abrirConta(1000, cliente1);
        Conta c4 = ag2.abrirConta(1000, cliente2);
        Conta c5 = ag3.abrirConta(1000, cliente1);
        Conta c6 = ag3.abrirConta(1000, cliente2);
        
        ag1.imprimirContas();
        ag2.imprimirContas();
        ag3.imprimirContas();
    }
}
