package Calculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
public class calcTests {

    private Calculator calculator;

    @Test
    /*
     * Create a fresh calculator before each test
     */
    public void newPlanner() throws Exception {
        calculator = new Calculator();
    }
}
