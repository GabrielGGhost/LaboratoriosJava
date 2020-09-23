package laboratorio4___6_6;

public class ControleDeFluxo {

  public static void main(String[] args) {
	String nome = "Carolina Pereira";
	int idade = 20;
	String rg = "34.654.789-9";
	char sexo = 'F';
	double salario = 1500.0;
	int anoAtual = 2009;
	double aliquota = 0.20;
	int anoNascimento = anoAtual - idade;
	double impostoDevido = salario * aliquota;

	String sexoPorExtenso; //= sexo == 'M' ? "masculino" : "feminino";
	
	if(sexo == 'M'){
		sexoPorExtenso = "Masculino";
	} else {
		sexoPorExtenso = "Feminino";
	}
	
	String textNome = "";
	String textNasc = "";
	String textRg = "";
	String textSexo = " do sexo " + sexoPorExtenso;
	String textTrabalho = "";
	String textImposto = " e pagará R$ " + impostoDevido + " de imposto.";
	
	switch (sexo) {
	case 'M':
		textNome = "O senhor " + nome;
		textNasc = "nascido no ano de " + anoNascimento;
		textRg = " portador do RG de número " + rg + ", \n";
		textTrabalho = ", está registrado com salário de R$ " + salario;
		break;
		
	case 'F':
		textNome = "A senhora " + nome;
		textNasc = "nascida no ano de " + anoNascimento;
		textRg = " portadora do RG de número " + rg + ", \n";
		textTrabalho = ", está registrada com salário de R$ " + salario;
		break;
	}
	
	System.out.println(textNome + textRg + textNasc + textSexo + textTrabalho
	    + textImposto);
  }
}
