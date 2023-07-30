import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import c6.Calculator;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    // TDD the addition method
    @Test
    public void calculatorAdds(){
        assertEquals(3, calculator.add(1,2));        
    }

     // TDD the addition method
     @Test
     public void calculatorAdd() {
         assertEquals(3, calculator.add(1, 2));
     }
 
     @Test
     public void calculatorSubtract() {
         assertEquals(2, calculator.subtract(4, 2));
     }
 
     @Test
     public void calculatorMultiply() {
         assertEquals(20, calculator.multiply(2,10));
     }
 
     @Test
     public void calculatorDivide() {
         assertEquals(2, calculator.divide(10, 5));
     }
 
     @Test
     public void calculatorRemainder() {
         assertEquals(2, calculator.divide(10,4));
     }
}
