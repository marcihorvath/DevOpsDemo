import org.junit.jupiter.api.Test;
import school.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorCheck {
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1));
    }
}
