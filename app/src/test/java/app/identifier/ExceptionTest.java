package app.identifier;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
/**
 * Example of JUnit 5.0 test for Identifier Program,
 * considering basic functional testing criterion.
 */
public class ExceptionTest {
    @Disabled
    @Test
    public void exception01() {
        assertThrows(StringIndexOutOfBoundsException.class, () -> {
            "CBSoft2019".substring(20);
        });
    }
}