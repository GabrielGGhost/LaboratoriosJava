package lab5_arays;

class Arrays {

  public static void main(String args[]) {
	String array[] = new String[5];
	
	for (int i = 0; i < array.length; i++) {
		array[i] = "Cliente" + (i+1) + "@hotmail.com"; 
	}
	
	int count = 0;
	for (String email : array) {
		System.out.println("Cliente " + ++count + " email: " + email);
	}
  }
}
