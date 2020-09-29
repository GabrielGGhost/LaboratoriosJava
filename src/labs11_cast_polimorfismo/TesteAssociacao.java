package labs11_cast_polimorfismo;

public class TesteAssociacao {

    public static void main(String[] args) {

        System.out.println("\n\nPASSO1: Criacao do banco:");
        Banco oBanco = new Banco("GlobalBank", 100);
        oBanco.imprimeDados();
 
        System.out.println("\n\nPASSO2: Criacao da agencia:");
        Agencia ag = new Agencia("001", oBanco);
        ag.imprimeDados();

        System.out.println("\n\nPASSO3: Criacao do titular:");
        Cliente titular = new Cliente("Joao da Silva", "12323");
        titular.imprimeDados();

        System.out.println("\n\nPASSO4: Criacao da conta:");
        Conta aConta = new Conta(10000, "1265", titular, ag);
        aConta.imprimeDados();
    }
}
