import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import utils.PropertyManager;

@RunWith(Cucumber.class)
public class CsiTest {

    @BeforeClass
    public static void setConfig() {
        PropertyManager.readFromProperty();
        Configuration.browser = PropertyManager.config.getProperty("browser");
        Configuration.timeout = Long.parseLong(PropertyManager.config.getProperty("timeout"));
    }
}
