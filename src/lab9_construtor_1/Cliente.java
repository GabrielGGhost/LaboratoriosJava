package lab9_construtor_1;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Crie um construtor para classe Cliente e remova o metodo inicializaCliente
 */
public class Cliente {

    private String nome;
    private String cpf;

    //public void inicializaCliente(String nomeCliente, String cpfCliente) {
    //    this.cpf = cpfCliente;
    //    this.nome = nomeCliente;
    //}

    Cliente(String nome, String cpf){
    	this.setNome(nome);
    	this.setCpf(cpf);
    }
    
    public String getCpf() {
        return this.cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Nome do cliente: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("----------------------");
    }
}
