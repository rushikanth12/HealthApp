import org.junit.After;
import org.junit.Before;
import utils.DriverFactory;

public class Hooks
{
    @Before
    public void setUp()
    {
        DriverFactory.getDriver();
    }

    @After
    public void closeDriver()
    {

        DriverFactory.teardown();
    }
}
