package Ejercicio6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ejercicio6_4 {

    @Test
    //La cuarta prueba verifica que la función devuelve un número negativo cuando el primer número es negativo y el segundo número es positivo.
    public void testCompareTwoNumbers_ReturnsNegativeNumberWhenFirstNumberIsNegativeAndSecondNumberIsPositive() {
        // Arrange
        int n1 = -10;
        int n2 = 5;

        // Act
        int result = Ejercicio6.compareTwoNumbers(n1, n2);

        // Assert
        Assertions.assertEquals(-1, result);
    }

}
