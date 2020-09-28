package lab9_construtor_2;
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
    
    Cliente(String nome, String cpf){
        this.setCpf(cpf);
        this.setNome(nome);
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
        System.out.println("Nome do cliente :" + this.getNome());
        System.out.println("CPF:" + this.getCpf());
        System.out.println("----------------------");
    }
}
