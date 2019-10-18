package app.identifier;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({app.identifier.IdentifierInitialTest.class,
        app.identifier.EquivalencePartitionTimeoutTest.class})
public class AllTestsByClass {
}