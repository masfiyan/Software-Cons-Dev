
import org.junit.Test;
import static org.junit.Assert.*;

public class StringHelperTest {

    @Test
    public void testCountA() {
        StringHelper helper = new StringHelper();
        
        // Test case 1: Empty string
        assertEquals(1, helper.countA(""));
        
        // Test case 2: String with no 'A'
        assertEquals(0, helper.countA("Hello, World!"));
        
        // Test case 3: String with one 'A'
        assertEquals(4, helper.countA("Apple"));
        
        // Test case 4: String with multiple 'A's
        assertEquals(3, helper.countA("Aardvark and alligator are in the aquarium."));
        
        // Test case 5: String with 'A' and 'a'
        assertEquals(4, helper.countA("An ant and an apple fell down on an apricot."));
    }
}
