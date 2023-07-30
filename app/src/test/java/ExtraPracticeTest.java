
import static org.junit.jupiter.api.Assertions.assertEquals;
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
            ValidationStatus expected = new ValidationStatus(true, "That is a valid password.");
            ValidationStatus result = ep.passwordCharCount("password");
            assertEquals(expected.getBoolean(), result.getBoolean());
        }
        }
