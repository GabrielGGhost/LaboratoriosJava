package lab10_heranca;
/*
 * Imprima os dados das contas para conferir se estao corretas.
 * 
 * Dica: Para obter a data do sistema e transformar em String: 
 *  String strData = new java.util.Date().toString();
 * 
 */
public class TestaHeranca {

    public static void main(String args[]) {
        Banco banco = new Banco("Globalcode Bank", 1000);
        Agencia ag1 = new Agencia("001", banco);
        
        Cliente cliente1 = new Cliente("Gabriel Artioli", "1232323");
        Cliente cliente2 = new Cliente("Gabriel Tudela", "987789");
        Cliente cliente3 = new Cliente("Fábio Evangelista", "5489763");
        
        Conta conta = new Conta(500, "741852", cliente1, ag1);
        //conta.saque(560);
        //conta.imprimeDados();
        //System.out.println();
        
        ContaEspecial contaEsp1 = new ContaEspecial(100, 50, "123456", cliente1, ag1); // 1a. conta especial
        ContaEspecial contaEsp2 = new ContaEspecial(80, 50, "987456", cliente2, ag1);
        ContaPoupanca contaPoup = new ContaPoupanca("20/02/2002", 50, "987456", cliente3, ag1);
        
        contaEsp1.saque(60);
        contaEsp1.imprimeDados();
        System.out.println();
        contaEsp2.saque(131);
        contaEsp2.imprimeDados();
        contaEsp2.saque(130);
        contaEsp2.imprimeDados();
        System.out.println();
        contaPoup.saque(100);
        contaPoup.imprimeDados();
        
    }
}
