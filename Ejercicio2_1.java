package Ejercicio2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ejercicio2_1 {

    @Test
  //La primera prueba verifica que la función devuelve el primer número cuando el primer número es el más alto.
    public void testFindHighestNumber_ReturnsSecondNumberWhenSecondNumberIsHighest() {
        // Arrange
        int n1 = 10;
        int n2 = 5;
        int n3 = 2;

        // Act
        int result = Ejercicio2.findHighestNumber(n1, n2, n3);

        // Assert
        Assertions.assertEquals(n1, result);
    }
    
    

}
