package app.identifier;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Example of JUnit 5.0 test for Identifier Program,
 * considering Equivalence Partition criterion.
 */
public class EquivalencePartitionTimeoutTest {
    private Identifier id;
    public final long LIMIT=20;

    @BeforeEach
    public void initialize() {
        id = new Identifier();
    }

    @Test
    public void validateIdentifier01() {
        assertTimeoutPreemptively(ofMillis(LIMIT), () -> {
            boolean result = id.validateIdentifier("abc");
            assertEquals(true, result);
        }, () -> "Aborted by timeout.");
    }

    @Test
    public void validateIdentifier02() {
        assertTimeoutPreemptively(ofMillis(LIMIT), () -> {
            boolean result = id.validateIdentifier("");
            assertEquals(false, result);
        }, () -> "Aborted by timeout.");
    }

    @Test
    public void validateIdentifier03() {
        assertTimeoutPreemptively(ofMillis(LIMIT), () -> {
            boolean result = id.validateIdentifier("A1b2C3d");
            assertEquals(false, result);
        }, () -> "Aborted by timeout.");
    }

    @Test
    public void validateIdentifier04() {
        assertTimeoutPreemptively(ofMillis(LIMIT), () -> {
            boolean result = id.validateIdentifier("2B3");
            assertEquals(false, result);
        }, () -> "Aborted by timeout.");
    }

    @Test
    public void validateIdentifier05() {
        assertTimeoutPreemptively(ofMillis(LIMIT), () -> {
            boolean result = id.validateIdentifier("Z#12");
            assertEquals(false, result);
        }, () -> "Aborted by timeout.");
    }
}