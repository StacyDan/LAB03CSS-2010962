package Ejercicio7;

public class Prueba7 {

	public static void main(String[] args) {
		new Prueba7();
	}
	public Prueba7() {
		
	}
	public static void sortArray(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}
