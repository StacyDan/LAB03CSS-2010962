package Ejercicio6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ejercicio6_3 {

    @Test
    //La tercera prueba verifica que la función devuelve un número cero cuando los dos números son iguales.
    public void testCompareTwoNumbers_ReturnsZeroWhenTwoNumbersAreEqual() {
        // Arrange
        int n1 = 10;
        int n2 = 10;

        // Act
        int result = Ejercicio6.compareTwoNumbers(n1, n2);

        // Assert
        Assertions.assertEquals(0, result);
    }

}
