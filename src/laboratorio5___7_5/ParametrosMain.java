package laboratorio5___7_5;

class ParametrosMain {

  public static void main(String[] args) {
	  
	if(args.length < 5) {
		System.out.println("É preciso passar os argumentos para o método Main");
		System.out.println("Ex: Java ParametrosMain <nome> <data nascimento> <rg> <sexo> <salario>");
		return;
	}
	  
	String nome = args[0];
	String dataNascimento = args[1];
	String rg = args[2];
	String salario = args[4];
	String sexo = args[3];
	String textNome = "O(a) Senhor(a) " + nome;
	String textNasc = ", nascido(a) em " + dataNascimento;
	String textRg = " portador(a)do rg de numero " + rg + ", \n";
	String textSexo = " do sexo " + sexo;
	String textTrabalho = ", está registrado(a) com o salário de R$ " + salario
	    + ".";
	System.out.println(textNome + textRg + textNasc + textSexo + textTrabalho);
  }
}
