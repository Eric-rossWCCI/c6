
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class ExtraPracticeTest {

    ExtraPractice ep = new ExtraPractice();

    @Test
    public void fizzTest() {
        String result = ep.fizzBuzz(6);
        assertNotNull(result);
        assertEquals("fizz", result);
    }

    @Test
    public void buzzTest() {
        String result = ep.fizzBuzz(5);
        assertEquals("buzz", result);
    }

    @Test
    public void fizzBuzzTest() {
        String result = ep.fizzBuzz(15);
        assertEquals("fizzbuzz", result);
    }

    @Test
    public void password8CharTest() {
        // tested the ability to create that ValidationStatus object with default constructor here to fail
        // then tested the ability to add parameters to create a ValidationStatus object with 2 params
        ValidationStatus expected = new ValidationStatus(true, "That is a valid password.");
        // tested the existence of our validation method
        // tested the ability of our validation method to receive a string and return a
        // ValidationStatus result
        ValidationStatus result = ep.validatePassword("password");
        // tested the ability of the validationStatus method to return the correct value for the boolean field
        assertEquals(expected.isSuccessful(), result.isSuccessful());
        assertEquals(expected.getMessage(), result.getMessage());
    }
    
    
    @Test
    public void password8CharTest_Failure(){
        ValidationStatus expected = new ValidationStatus(false, "Password must be at least 8 characters");
        ValidationStatus result = ep.validatePassword("passwor");
        assertEquals(expected.isSuccessful(), result.isSuccessful());
        assertEquals(expected.getMessage(), result.getMessage());

    }

    @Test
    public void passwordNumCount_Failure(){
        // setup
        String expectedMessage = "The password must contain at least 2 numbers";

        // invocation
        ValidationStatus result = ep.validatePassword("passw0rd");
        assertEquals(expectedMessage, result.getMessage());
    }

    @Test
    public void passwordNumCount(){
        // setup
        String expectedMessage = "The password must contain at least 2 numbers";

        // invocation
        ValidationStatus result = ep.validatePassword("passw12");
        assertNotEquals(expectedMessage, result.getMessage());


    }
}
