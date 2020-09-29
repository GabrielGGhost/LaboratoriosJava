package labs12_asbtract_2;
/*
 * Globalcode - "The Developers Company"
 *
 * Academia do Java
 *
 */
public abstract class Agencia {

    private String numero;
    private Banco banco;

    public Agencia(String num, Banco bc) {
    	this.setNumero(num);
        this.setBanco(bc);
    }

    public Banco getBanco() {
        return this.banco;
    }

    public String getNumero() {
        return this.numero;
    }
    
    public void setBanco(Banco b) {
        this.banco = b;
    }

    public void setNumero(String num) {
        this.numero = num;
    }

    public void imprimeDados() {
        System.out.println("Agencia no. " + this.getNumero());
        this.getBanco().imprimeDados();
    }

    public void ajustarLimites(ContaEspecial[] contasEspeciais) {
        System.out.println("===================================================================");
        System.out.println("Agencia: " + this.getNumero() + " ajustando limites");
        for (int i = 0; i < contasEspeciais.length; i++) {
            ContaEspecial ce = contasEspeciais[i];
            if (ce != null) {
                if (ce.getAgencia() != this) {
                    System.out.println("A conta " + ce.getNumero() + " nao pertence a esta agencia");
                } else {
                    double limiteAntigo = ce.getLimite();
                    ajustarLimiteIndividual(ce);
                    double limiteAjustado = ce.getLimite();
                    System.out.println("conta " + ce.getNumero() +
                                       "\tlimite antigo: " + limiteAntigo +
                                       "\tlimite ajustado: " + limiteAjustado);
                }
            }
        }
        System.out.println("limites ajustados");
        System.out.println("===================================================================");


    }

    protected abstract void ajustarLimiteIndividual(ContaEspecial contaEspecial);


    public Conta abrirConta(Cliente titular, double saldoInicial) {
        String numeroConta = "" + (int) (Math.random() * 9999999);
        if (saldoInicial <= 500) {
            return new Conta(saldoInicial, numeroConta, titular, this);
        } else if (saldoInicial > 500 && saldoInicial <= 1000) {
            String hoje = "" + new java.util.Date();
            return new ContaPoupanca(saldoInicial, numeroConta, titular, this, hoje);
        } else {
            return null;
        }
    }

}