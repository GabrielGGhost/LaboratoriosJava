package laboratorio4___6_6;

class ControleFluxoWhileOpcional {

  public static void main(String[] args) {
	int limiteInferior = 14;
	int limiteSuperior = 1578;
	int numerosDiv6 = 0;
	
	while(limiteInferior <= limiteSuperior) {
		
		if(limiteInferior % 6 == 0) numerosDiv6++;
		limiteInferior++;
	}
	
	String texto = "Quantidade de numeros divisiveis por 6 entre ";
	System.out.println(texto + limiteInferior + " e " + limiteSuperior
	    + " e : " + numerosDiv6);
  }
}
