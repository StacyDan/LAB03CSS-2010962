package Ejercicio7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Prueba7Test {

    @Test
    //Si el aaray queda vacio
    public void testArrayVacio() {
        int[] array = new int[0];
        Prueba7.sortArray(array);
        assertEquals(0, array.length);
    }

	@Test
	//Si se agrega solo 1 elemento al array
    public void testArrayUnico() {
        int[] array = new int[]{1};
        Prueba7.sortArray(array);
        assertEquals(1, array.length);
        assertEquals(1, array[0]);
    }

    @Test
    //Si el array se agrega valores de forma ascendente
    public void testArrayOrdenado() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        Prueba7.sortArray(array);
        assertEquals(5, array.length);
        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);
        assertEquals(4, array[3]);
        assertEquals(5, array[4]);
    }

    @Test
    //Si el array se agrega los valores de forma descendente
    public void testArrayDesordenado() {
        int[] array = new int[]{5, 4, 3, 2, 1};
        Prueba7.sortArray(array);
        assertEquals(5, array.length);
        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);
        assertEquals(4, array[3]);
        assertEquals(5, array[4]);
    }
}
