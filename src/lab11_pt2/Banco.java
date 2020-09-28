package lab11_pt2;

public class Banco {

    private String nome;
    private int numero;
    private Agencia[] agencias;
    private int numAgenciasAbertas = 0;
    private static int numeroProximaAgencia = 1234;

    public Banco(String nome, int numero, int numeroMaxAgencias) {
        this.setNome(nome);
        this.setNumero(numero);
        this.setAgencias(new Agencia[numeroMaxAgencias]);
    }

    public Agencia[] getAgencias() {
		return this.agencias;
	}

	public void setAgencias(Agencia[] agencias) {
		this.agencias = agencias;
	}

	public int getNumAgenciasAbertas() {
		return this.numAgenciasAbertas;
	}

	public void setNumAgenciasAbertas(int numAgenciasAbertas) {
		this.numAgenciasAbertas = numAgenciasAbertas;
	}

	public static int getNumeroProximaAgencia() {
		return Banco.numeroProximaAgencia;
	}

	public static void setNumeroProximaAgencia(int numeroProximaAgencia) {
		Banco.numeroProximaAgencia = numeroProximaAgencia;
	}

	public String getNome() {
        return this.nome;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int num) {
        this.numero = num;
    }

    public void imprimeDados() {
        System.out.println("Banco: " + this.getNome() + "\tNumero do banco " + this.getNumero());
    }

    public Agencia abrirAgencia() {
        Agencia a = new Agencia("" + (Banco.getNumeroProximaAgencia() + 1), this, 5);
        Banco.setNumeroProximaAgencia(Banco.getNumeroProximaAgencia() + 1);
        boolean agenciaAdicionada = adicionaArrayAgencias(a);
        if (agenciaAdicionada) {
            return a;
        } else {
            return null;
        }
    }

    private boolean adicionaArrayAgencias(Agencia ag) {
        if (this.getAgencias().length <= this.getNumAgenciasAbertas()) {
            System.out.println("Banco ERROR: Nao foi possivel criar uma nova agencia");
            return false;
        } else {
            System.out.println("Banco DEBUG: Agencia adicionada ao array " + this.getNumAgenciasAbertas());
            this.agencias[numAgenciasAbertas] = ag;
            this.setNumAgenciasAbertas(this.getNumAgenciasAbertas() + 1);
            return true;
        }
    }

    public void imprimeAgencias() {
        System.out.println("\n\n=============== RELATORIO DE AGENCIAS DO BANCO ==================\n");
        System.out.println("Numero de agencias abertas: " + this.getNumAgenciasAbertas());
        for (int i = 0; i < this.getNumAgenciasAbertas(); i++) {
            this.agencias[i].imprimeDados();
        }
        System.out.println("===============================================");
    }
}