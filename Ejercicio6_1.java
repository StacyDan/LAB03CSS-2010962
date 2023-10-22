package Ejercicio6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ejercicio6_1 {

    @Test
    //La primera prueba verifica que la función devuelve un número positivo cuando el primer número es mayor que el segundo número.
    public void testCompareTwoNumbers_ReturnsPositiveNumberWhenFirstNumberIsGreaterThanSecondNumber() {
        // Arrange
        int n1 = 10;
        int n2 = 5;

        // Act
        int result = Ejercicio6.compareTwoNumbers(n1, n2);

        // Assert
        Assertions.assertEquals(1, result);
    }

}
