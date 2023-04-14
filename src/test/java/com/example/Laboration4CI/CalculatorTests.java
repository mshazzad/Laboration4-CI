package com.example.Laboration4CI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class CalculatorTests {
    Calculator calculator =new Calculator();

    @Test
    void canAddNumber() {
        int result = calculator.add(3,6);
        Assertions.assertEquals(result, 9);
    }
    @Test
    void canAddNumberWithPlusMinus() {
        int result = calculator.add(-3,6);
        Assertions.assertEquals(result, 3);
    }
    @Test
    void canSubtractNumber() {
        int result = calculator.subtract(16,9);
        Assertions.assertEquals(result, 7);
    }
    @Test
    void canSubtractNumberAndShowMinusResult() {
        int result = calculator.subtract(6,19);
        Assertions.assertEquals(result, -13);
    }
    @Test
    void canMultiplyNumber() {
        int result = calculator.multiply(16,9);
        Assertions.assertEquals(result, 144);
    }
    @Test
    void canDivideNumber() {
        double result = calculator.divide(18,4);
        Assertions.assertEquals(result, 4.5);
    }
    @Test
    void canSquareRootOfNumber() {
        double result = calculator.squareRootOf(18);
        Assertions.assertEquals(result,4.242640687119285);
    }
    @Test
    void canGetArea() {
        double result = calculator.getArea(18);
        Assertions.assertEquals(result,1017.88);
    }

    @Test
    void canFindNaNDuringGetArea() {
        double result = calculator.getArea(-18);
        Assertions.assertFalse(result== Double.NaN);
    }

    @Test
    void canGetCircumference() {
        double result = calculator.getCircumference(10);
        Assertions.assertEquals(result,62.83);
    }

}
