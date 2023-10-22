package Ejercicio2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ejercicio2_4 {

    @Test
    //La cuarta prueba verifica que la función devuelve el mismo número para todos los números de entrada.
    public void testFindHighestNumber_ReturnsSameNumberForAllInput() {
        // Arrange
        int n1 = 10;
        int n2 = 10;
        int n3 = 10;

        // Act
        int result = Ejercicio2.findHighestNumber(n1, n2, n3);

        // Assert
        Assertions.assertEquals(n1, result);
    }

}
