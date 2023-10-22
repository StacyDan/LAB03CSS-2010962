package Ejercicio10;

import java.util.List;

public class Prueba10 {
	
	public static void main(String[] args) {
		new Prueba10();
	}
	
	public Prueba10() {
		
	}
	
	public static int add(List<Integer> numbers) {
		if (numbers == null || numbers.isEmpty()) {
			throw new NullPointerException();
		}
		int sum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}
		return sum;
		}
	}

