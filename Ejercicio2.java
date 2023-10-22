package Ejercicio2;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		new Ejercicio2();
	}

	public Ejercicio2() {

	}
	
	//Ejercicio2
	public static int findHighestNumber(int n1, int n2, int n3) {
		if (n1 > n2 && n1 > n3) {
			return n1;
		} else if (n3 > n2) {
			return n3;
		} else {
			return n2;
		}
	}

}
