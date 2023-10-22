package Ejercicio10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class Prueba10Test {

	@Test
	//Cuando la lista no tienen ningun valor 
    public void testListaVacia() {
        List<Integer> numbers = Collections.emptyList();
        assertThrows(NullPointerException.class, () -> Prueba10.add(numbers));
    }

    @Test
    //Cuando la lista es nula
    public void testListaNula() {
        assertThrows(NullPointerException.class, () -> Prueba10.add(null));
    }

    @Test
    //Cuando la lista tiene solo 1 numero y ese es el resultado de la suma
    public void testListaUnica() {
        List<Integer> numbers = Collections.singletonList(1);
        assertEquals(1, Prueba10.add(numbers));
    }

    @Test
    //Prueba cuando la lista tiene numeros y se deben de sumar
    public void testListaMultiple() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(15, Prueba10.add(numbers));
    }

}
