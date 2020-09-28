package lab7_metodos_2;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Analise o codigo
 * 
 */
class Cliente {

    String nome;
    String cpf;

    void inicializaCliente(String nomeCliente, String cpfCliente) {
        cpf = cpfCliente;
        nome = nomeCliente;
    }

    void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Nome do cliente :" + nome);
        System.out.println("CPF:" + cpf);
        System.out.println("----------------------");
    }
}
