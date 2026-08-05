package fm.framework.runner;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;


@Suite
@IncludeEngines("cucumber")
/*SelectClasspathResource ----This always gives all the details inside the package
* [WARNING] Tests run: 2, Failures: 0, Errors: 0, Skipped: 1 so we need to used @SelectClasspathResource("features")----> @SelectPackages ("features") */
@SelectPackages("features")
public class RegressionRunner
{
}
