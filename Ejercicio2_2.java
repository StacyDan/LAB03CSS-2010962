package Ejercicio2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ejercicio2_2 {

    @Test
    //La segunda prueba verifica que la función devuelve el segundo número cuando el segundo número es el más alto.
    public void testFindHighestNumber_ReturnsSecondNumberWhenSecondNumberIsHighest() {
        // Arrange
        int n1 = 5;
        int n2 = 10;
        int n3 = 2;

        // Act
        int result = Ejercicio2.findHighestNumber(n1, n2, n3);

        // Assert
        Assertions.assertEquals(n2, result);
    }

}
