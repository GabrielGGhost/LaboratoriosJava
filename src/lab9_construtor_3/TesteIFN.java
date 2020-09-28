package lab9_construtor_3;
public class TesteIFN {

    public static void main(String[] args) {

        System.out.println("Taxa IFN Vigente: " + Conta.getTaxaIFN());
        
        Conta conta1 = new Conta(600, "987444", "Gabriel Monteiro da Silva", "3456", 202);
        Conta conta2 = new Conta(800, "435357", "Bernardino de Campos", "3456", 202);
        
        conta1.imprimeDados();
        conta2.imprimeDados();
        
        conta1.saque(200);
        conta2.saque(400);
        
        System.out.println("IFN devido por conta1:" + conta1.getIfn());
        System.out.println("IFN devido por conta2:" + conta2.getIfn());
        
        // alterando o IFN
        Conta.setTaxaIFN(0.03);
        System.out.println("\n\nNova Taxa IFN: " + Conta.getTaxaIFN());
        conta1.saque(150);
        conta2.saque(300);
        
        System.out.println("IFN devido por conta1:" + conta1.getIfn());
        System.out.println("IFN devido por conta2:" + conta2.getIfn());
    
    }
}
