package mx.onekey.dev.cpaas.api.it;

import mx.onekey.dev.cpaas.api.connectors.UsagesConnector;
import mx.onekey.dev.cpaas.api.domain.list.UsagesList;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import org.junit.Test;

public class UsageIT extends BaseIntegrationTest {


    public UsageIT() throws ZangException {
    }

    @Test
    public void usages() throws ZangException {
        UsagesConnector conn = connectorFactory.getUsagesConnector();
        UsagesList usages = conn.listUsages();
        if (usages.getTotal() > 0) {
            conn.viewUsage(usages.iterator().next().getSid());
        }
    }

}
