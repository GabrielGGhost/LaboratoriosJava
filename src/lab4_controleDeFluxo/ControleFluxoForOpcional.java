package lab4_controleDeFluxo;

class ControleFluxoForOpcional  {

  public static void main(String[] args) {
	int limiteInferior = 100;
	int limiteSuperior = 200;

	for (; limiteInferior <= limiteSuperior; limiteInferior++) {
		
		if(limiteInferior % 2 == 0 && limiteInferior % 3 == 0) {
			
			System.out.println("O n�mero " + limiteInferior + " � divis�vel por 2 e por 3, portanto � divis�vel por 6");
		} else if(limiteInferior % 2 == 0) {
			
			System.out.println("O n�mero " + limiteInferior + " � divisivel por 2");
		} else {
			System.out.println("O n�mero " + limiteInferior + " � divisivel por 3");
		}
	}
  }
}
