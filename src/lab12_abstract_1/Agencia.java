package lab12_abstract_1;

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
                    ajustarLimiteIndividual(ce); // metodo abstrato
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

}