import org.junit.jupiter.api.Test;
import school.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegrationTest {
    @Test
    public void testIntegration() {
        Calculator c1 = new Calculator();
        int r1 = c1.add(2,2);

        Calculator c2 = new Calculator();
        int r2 = c2.add(3,3);

        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(r1,r2));
    }
}
