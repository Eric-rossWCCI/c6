/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package c6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AppTest {
    // bring to instance/class level so that it can be reused
    App classUnderTest = new App();

    @Test
    void appHasAGreeting_HappyPath() {
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
        assertEquals("Hello World!", classUnderTest.getGreeting());
    }

    // create a test that tests a non existing method. This should return the number
    // of words in a list that start with the letter e
    /*
     * created test that calls non existent method
     * called the method with a list O strings
     * expect method to return an Integer
     * expect method to return 2
     */
    @Test
    public void wordsThatStartWithETest_HappyPath(){
        List<String> strings = new ArrayList<String>(Arrays.asList("Cat", "Dog", "Every", "eye", "open"));
        long result = classUnderTest.wordsThatStartWithE(strings);
        assertEquals(2L, result);

    }
    
}