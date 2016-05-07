package junit.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import stephenfoxDemo.CukesRunner;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CukesRunner.class
        // ,

})
public class CucumberTestSuites {
}
