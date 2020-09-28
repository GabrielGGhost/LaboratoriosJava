package lab7_metodos_2;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * O metodo inicializaConta e util para evitar a necessidade de inicializar
 * atributo por atributo, desta forma podemos chamar um unico metodo e passar
 * todos os parametros em uma unica chamada.
 * 
 * 1) Implemente os metodos que nao foram implementados na classe Conta de 
 * acordo com a especificacao nos metodos.
 */
class Conta {

    double saldo;
    String numero;
    String titular;
    int agencia;
    int banco;

    void inicializaConta(double saldoInicial, String num, String tit, int ag, int bc) {
        System.out.println("Inicializando uma conta com os seguintes dados:");
        saldo = saldoInicial;
        numero = num;
        titular = tit;
        agencia = ag;
        banco = bc;
    }

    /*
     * 1. Verificar se o valor do saque e positivo.
     * 2. Verificar se ha saldo suficiente para efetuar o saque 
     *    2.1. Se o saldo for suficiente, efetuar o saque 
     *    2.2. Se o saldo for insuficiente imprimir na tela que o saldo e insuficiente
     */
    void saque(double valor) {
    	if(valor > 0) {
    		if(valor <= this.getSaldo()) {
    			this.setSaldo(this.getSaldo() - valor);
    		} else {
    			System.out.println("Saldo insuficiente");
    		}
    	} else {
    		System.out.println("Valor do saque precisa ser positivo");
    	}
    }

    public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getBanco() {
		return banco;
	}

	public void setBanco(int banco) {
		this.banco = banco;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/*
     * 1. Verificar se o valor do deposito e positivo, se for efetue o deposito
     */
    void deposito(double valor) {
    	if(valor > 0) {
    		this.setSaldo(this.getSaldo() + valor);
    	} else {
    		System.out.println("Valor precisa ser maior que 0");
    	}
    }


    void imprimeDados() {
        System.out.println("\n----------------------------");
        System.out.println("AGENCIA:\t" + agencia + "\t BANCO:\t" + this.getBanco());
        System.out.println("NUMERO: \t" + this.getNumero());
        System.out.println("TITULAR: \t" + this.getTitular());
        System.out.println("SALDO: \t" + this.getSaldo());
        System.out.println("-----------------------------\n");
    }

    double getSaldo() {
        return this.saldo;
    }
}
