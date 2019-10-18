package app.identifier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Example of JUnit 5.0 test for Identifier Program,
 * considering Equivalence Partition criterion.
 */
public class EquivalencePartitionBeforeEachTest {
    private Identifier id;

    @BeforeEach
    public void initialize() {
        id = new Identifier();
    }

    @Test
    public void validateIdentifier01() {
        boolean result = id.validateIdentifier("abc");
        assertEquals(true, result);
    }

    @Test
    public void validateIdentifier02() {
        boolean result = id.validateIdentifier("");
        assertEquals(false, result);
    }

    @Test
    public void validateIdentifier03() {
        boolean result = id.validateIdentifier("A1b2C3d");
        assertEquals(false, result);
    }

    @Test
    public void validateIdentifier04() {
        boolean result = id.validateIdentifier("2B3");
        assertEquals(false, result);
    }

    @Test
    public void validateIdentifier05() {
        boolean result = id.validateIdentifier("Z#12");
        assertEquals(false, result);
    }
}