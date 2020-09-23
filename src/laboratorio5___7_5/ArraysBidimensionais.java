package laboratorio5___7_5;


class ArraysBidimensionais {

  public static void main(String args[]) {
	int array[][] = { { 1, 6, 7 }, { 2, 5, 1, 0 }, { 2, 4, 1, 2, 1 } };
	
	
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			System.out.print(array[i][j] + " ");
		}
		System.out.println();
	}
  }
}
