package Ejercicio2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ejercicio2_3 {

    @Test
    //La tercera prueba verifica que la función devuelve el tercer número cuando el tercer número es el más alto.
    public void testFindHighestNumber_ReturnsThirdNumberWhenThirdNumberIsHighest() {
        // Arrange
        int n1 = 5;
        int n2 = 2;
        int n3 = 10;

        // Act
        int result = Ejercicio2.findHighestNumber(n1, n2, n3);

        // Assert
        Assertions.assertEquals(n3, result);
    }
}
