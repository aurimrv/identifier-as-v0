package app.identifier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Example of JUnit 5.0 test for Identifier Program,
 * considering Equivalence Partition criterion.
 */
public class EquivalencePartitionTest {
    @Test
    public void validateIdentifier01() {
        Identifier id = new Identifier();
        boolean result = id.validateIdentifier("abc");
        assertEquals(true, result);
    }

    @Test
    public void validateIdentifier02() {
        Identifier id = new Identifier();
        boolean result = id.validateIdentifier("");
        assertEquals(false, result);
    }

    @Test
    public void validateIdentifier03() {
        Identifier id = new Identifier();
        boolean result = id.validateIdentifier("A1b2C3d");
        assertEquals(false, result);
    }

    @Test
    public void validateIdentifier04() {
        Identifier id = new Identifier();
        boolean result = id.validateIdentifier("2B3");
        assertEquals(false, result);
    }

    @Test
    public void validateIdentifier05() {
        Identifier id = new Identifier();
        boolean result = id.validateIdentifier("Z#12");
        assertEquals(false, result);
    }
}