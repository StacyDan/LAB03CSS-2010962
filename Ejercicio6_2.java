package Ejercicio6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ejercicio6_2 {

    @Test
    //La segunda prueba verifica que la función devuelve un número negativo cuando el primer número es menor que el segundo número.
    public void testCompareTwoNumbers_ReturnsNegativeNumberWhenFirstNumberIsLessThanSecondNumber() {
        // Arrange
        int n1 = 5;
        int n2 = 10;

        // Act
        int result = Ejercicio6.compareTwoNumbers(n1, n2);

        // Assert
        Assertions.assertEquals(-1, result);
    }

}
