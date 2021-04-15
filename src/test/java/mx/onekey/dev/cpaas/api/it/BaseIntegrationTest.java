package mx.onekey.dev.cpaas.api.it;

import mx.onekey.dev.cpaas.api.configuration.PropertiesFileZangConfiguration;
import mx.onekey.dev.cpaas.api.configuration.ZangConfiguration;
import mx.onekey.dev.cpaas.api.connectors.ZangConnectorFactory;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import mx.onekey.dev.cpaas.api.testutil.IntegrationTest;
import mx.onekey.dev.cpaas.api.testutil.TestParameters;
import org.junit.experimental.categories.Category;

@Category(IntegrationTest.class)
public abstract class BaseIntegrationTest {

    ZangConfiguration conf;
    TestParameters testParameters;
    ZangConnectorFactory connectorFactory;

    public BaseIntegrationTest() throws ZangException {
        this.testParameters = new TestParameters();
        conf = new PropertiesFileZangConfiguration();
        connectorFactory = new ZangConnectorFactory(conf);

    }

    protected void sleep() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
    }
}
